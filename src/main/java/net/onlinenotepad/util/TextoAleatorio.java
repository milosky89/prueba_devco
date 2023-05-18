package net.onlinenotepad.util;

import com.github.javafaker.Faker;

public class TextoAleatorio {

    public static final Faker faker = new Faker();

    public static String mensajeAleatorio(){
        return faker.superhero().descriptor();
    }
}
