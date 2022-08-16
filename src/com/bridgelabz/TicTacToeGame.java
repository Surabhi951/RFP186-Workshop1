package com.bridgelabz;

import java.util.Scanner;

public class TicTacToeGame {
    static char[] board = new char[10];
    static char userLetter;
    static char computerLetter;

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        createEmptyBoard();
        chooseLetter();
        showBoard();
        playerTurn();
    }

    static void createEmptyBoard(){
        for(int index = 1; index < board.length; index++){
            board[index] = ' ';
        }
    }

    static void chooseLetter(){
        //Scanner sc = new Scanner(System.in);
        System.out.println("choose a letter :: X or O :");
        userLetter = sc.next().toUpperCase().charAt(0);
        computerLetter = (userLetter == 'X') ? 'O' : 'X';
    }

    static void showBoard(){
        System.out.println(board[1] + " | " + board[2] + " | " + board[3]);
        System.out.println("-----------");
        System.out.println(board[4] + " | " + board[5] + " | " + board[6]);
        System.out.println("-----------");
        System.out.println(board[7] + " | " + board[8] + " | " + board[9]);
    }

    static void playerTurn(){
        int playerMove;
        do {
            System.out.println("choose your location(1-9): ");
            playerMove = sc.nextInt();
        } while (board[playerMove] != ' ');
        System.out.println("player choose: " + playerMove);
        board[playerMove] = userLetter;
    }
}
