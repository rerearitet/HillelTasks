package com.antongorokh.task26;

/*Ввести с клавиатуры дату в формате «08/18/2019»
Вывести на экран эту дату в виде «AUG 18, 2019».*/

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        System.out.println(new SimpleDateFormat("MMM dd, YYYY", Locale.ENGLISH).format(new SimpleDateFormat("MM/dd/yyyy").parse(new Scanner(System.in).nextLine())).toUpperCase()); // :)
    }
}
