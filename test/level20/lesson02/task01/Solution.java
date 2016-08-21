package com.javarush.test.level20.lesson02.task01;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* Читаем и пишем в файл: Human
Реализуйте логику записи в файл и чтения из файла для класса Human
Поле name в классе Human не может быть пустым
В файле your_file_name.tmp может быть несколько объектов Human
Метод main реализован только для вас и не участвует в тестировании
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or fix outputStream/inputStream according to your real file location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {

            File your_file_name = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream("d:\\1.txt"); //(your_file_name);
            InputStream inputStream = new FileInputStream("d:\\1.txt"); //(your_file_name);

            Human ivanov = new Human("Ivanov", new Asset("home_I"), new Asset("car_I"), new Asset("book_I"));
            ivanov.save(outputStream);

            Human petrov = new Human("Petrov", new Asset("home_P"), new Asset("car_P"));
            petrov.save(outputStream);
            outputStream.flush();

            printHuman(ivanov);
            printHuman(petrov);

            Human ivanovPerson = new Human();
            ivanovPerson.load(inputStream);

            Human petrovPerson = new Human();
            petrovPerson.load(inputStream);

            printHuman(ivanovPerson);
            printHuman(petrovPerson);

            //check here that ivanov equals to somePerson - проверьте тут, что ivanov и somePerson равны
            if (ivanovPerson.equals(ivanov))
            {
                System.out.println("Ivanov - ok");
            } else {
                System.out.println("Ivanov - error");
            }
            inputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    private static void printHuman(Human human)
    {
        System.out.println("Name: " + human.name);
        for (Asset asset :
                human.assets)
        {
            System.out.println("    asset name: " + asset.getName() + " assetPrice: " + asset.getPrice());
        }
        System.out.println();
    }


    public static class Human {
        public String name;
        public List<Asset> assets = new ArrayList<>();

        public Human() {
        }

        public Human(String name, Asset... assets) {
            this.name = name;
            if (assets != null) {
                this.assets.addAll(Arrays.asList(assets));
            }
        }

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            PrintWriter printWriter = new PrintWriter(outputStream);
            if (name != null)
            {
                printWriter.println(name);
                printWriter.println(assets.size());
                for (Asset asset :
                        assets)
                {
                    printWriter.println(asset.getName());
                    printWriter.println(asset.getPrice());
                }
            }
            printWriter.flush();
        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            name = bufferedReader.readLine();
            Integer assertsSize = Integer.parseInt(bufferedReader.readLine());

            if (assertsSize > 0)
            {
                for (int index = 0; index < assertsSize; index ++)
                {
                    Asset asset = new Asset(bufferedReader.readLine());
                    asset.setPrice(Double.parseDouble(bufferedReader.readLine()));
                    this.assets.add(asset);
                }
            }


            bufferedReader.close();
        }
    }
}
