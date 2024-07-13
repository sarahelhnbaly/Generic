package com.main;

import com.generic.clothes.Clothes;
import com.util.clothes.NewPair;
import com.util.clothes.Sock;
import com.generic.clothes.Shirt;

public class Main {

    public static void main(String[] args) {
        // Create a pair of socks
        NewPair<Sock> sockPair = new NewPair<>(new Sock(), new Sock());

        // Create a pair of shirts
        NewPair<Shirt> shirtPair = new NewPair<>(new Shirt(), new Shirt());

        // Create a pair of clothes
        NewPair<Clothes> clothesPair = new NewPair<>(new Clothes(), new Clothes());

        // Print the pairs
        System.out.println(sockPair); // Output: (l,r) = (Sock, Sock)
        System.out.println(shirtPair); // Output: (l,r) = (Shirt, Shirt)
        System.out.println(clothesPair); // Output: (l,r) = (Clothes, Clothes)

        // Access the elements in the pair
        Sock leftSock = sockPair.getL();
        Shirt leftShirt = shirtPair.getL();
        Clothes leftClothes = clothesPair.getL();

        System.out.println(leftSock); // Output: Sock
        System.out.println(leftShirt); // Output: Shirt
        System.out.println(leftClothes); // Output: Clothes
    }
}
