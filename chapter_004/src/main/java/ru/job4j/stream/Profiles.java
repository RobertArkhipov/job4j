package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Task.
 */
public class Profiles {

    List<Address> collect(List<Profile> profiles) {
        return profiles.stream().map(
                profile -> profile.getAddress()
        ).collect(Collectors.toList());
    }
    public static void main(String[] args) {
        List<Profile> clients = Arrays.asList(
                new Profile(new Address("Moscow", "Vishnovaya,", 5, 1)),
                new Profile(new Address("Bryansk", "Lenina", 3, 25)),
                new Profile(new Address("Voronezh", "Savrasova", 2, 56))
        );
        System.out.println(new Profiles().collect(clients).toString());
    }
}