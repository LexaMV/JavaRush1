package com.javarush.test.level05.lesson07.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    private String filename = null;

    public void initialize(String name)
    {
        this.filename = name;
    }

    public void initialize(String name, int age)
    {
        this.filename = name + age;
    }//напишите тут ваш код

    public void initialize(String name, int age, String sex)
    {
        this.filename = name + age + sex;
    }
}
