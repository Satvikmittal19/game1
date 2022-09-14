package com.example.gameui;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.*;
import static java.util.concurrent.TimeUnit.SECONDS;

class wordsearcher extends myFrame
{static int size;
    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public void main() throws Exception
    {
        Scanner scs=new Scanner(System.in);
        button6.setBounds(0, 0, 100, 50);
        button6.addActionListener(this);
        button6.setBackground(Color.cyan);
        button6.setBorder(BorderFactory.createLoweredSoftBevelBorder());
        button6.setText("animal");
        button6.setFocusable(false);
        System.out.println("enter the quiz you want to play");
       // int ch=scs.nextInt();
        List<String> word = new ArrayList<>();
        button6.addActionListener(e -> {
            Scanner sc = new Scanner(new File("animals.txt"));
            String s;
            for(int i=0;i<15;i++)
            {
                s=Files.readAllLines(Paths.get("animals.txt")).get(getRandomNumber(1,516));
                word.add(s.toLowerCase());
                //System.out.println(s);
            }
            sc.close();

        });
       /* {
            Scanner sc = new Scanner(new File("animals.txt"));
            String s;
            for(int i=0;i<15;i++)
            {
                s=Files.readAllLines(Paths.get("animals.txt")).get(getRandomNumber(1,516));
                word.add(s.toLowerCase());
                //System.out.println(s);
            }
            sc.close();
        }*/
        button7.addActionListener(e -> {
            Scanner sc = new Scanner(new File("cars.txt"));
            String s;
            for(int i=0;i<15;i++)
            {
                s=Files.readAllLines(Paths.get("C:/Users/USER/Desktop/cars.txt")).get(getRandomNumber(1,61));
                word.add(s.toLowerCase());
                //System.out.println(s);
            }
            sc.close();


        });

        /*if(ch==2)
        {
            Scanner sc = new Scanner(new File("cars.txt"));
            String s;
            for(int i=0;i<15;i++)
            {
                s=Files.readAllLines(Paths.get("cars.txt")).get(getRandomNumber(1,61));
                word.add(s.toLowerCase());
                //System.out.println(s);
            }
            sc.close();
        }*/

        button7.addActionListener(e -> {

            Scanner sc = new Scanner(new File("footballers.txt"));
            String s;
            for(int i=0;i<15;i++)
            {
                s=Files.readAllLines(Paths.get("footballers.txt")).get(getRandomNumber(1,28));
                word.add(s.toLowerCase());
                //System.out.println(s);
            }
            sc.close();

        });

        /*if(ch==3)
        {
            Scanner sc = new Scanner(new File("footballers.txt"));
            String s;
            for(int i=0;i<15;i++)
            {
                s=Files.readAllLines(Paths.get("footballers.txt")).get(getRandomNumber(1,28));
                word.add(s.toLowerCase());
                //System.out.println(s);
            }
            sc.close();
        }*/


        button7.addActionListener(e -> {
            //BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
            Scanner sc = new Scanner(new File("cities.txt"));
            int now;
            String s;
            for(int i=0;i<20;i++)
            {
                s=Files.readAllLines(Paths.get("cities.txt")).get(getRandomNumber(1,99));
                word.add(s.toLowerCase());
                //System.out.println(s);
            }
            sc.close();

        });
        /*if(ch==4)
        {
            Scanner sc = new Scanner(new File("cities.txt"));
            int now;
            String s;
            for(int i=0;i<20;i++)
            {
                s=Files.readAllLines(Paths.get("cities.txt")).get(getRandomNumber(1,99));
                word.add(s.toLowerCase());
                //System.out.println(s);
            }
            sc.close();
        }*/



        System.out.println("enter how tough you want the quiz to be\n1.EASY\n2.MODERATE\n3.THOUGH and input the serial number in it respectivly");
        int chc=scs.nextInt();

        ListIterator listItr = word.listIterator();
        //int siz=15;
        button9.addActionListener(e -> {                        //easy
            int siz=10;
            //char alpha[][]=new char[siz][siz];
        });
        //if(chc==1) siz=10;
        button10.addActionListener(e -> {                      //Medium
           int  siz=15;
          // char alpha[][]=new char[siz][siz];
        });
        //if(chc==2) siz=15;
        button11.addActionListener(e -> {                      //Hard
            int siz=25;

            size=siz;
        });
        char alpha[][]=new char[size][size];
        //if(chc==3) siz=25;
        //char alpha[][]=new char[siz][siz];



        String alphabet = "abcdefghikjlmnopqrstuvwxyz";
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                alpha[i][j]=alphabet.charAt(getRandomNumber(0,26));
                //System.out.print(alpha[i][j]+"\t");
            }
            //System.out.println();
        }

        //System.out.println(words.get(3));
        int r;
        int c;
        int k=0;
        System.out.println("the words to be found out are");
        if(size==10)
        {
            for(int i=0, j=0;j<=4;j++)
            {

                word.get(j);
                int len= word.get(j).length();
                System.out.println(word.get(j));
                for(int l=0;l<len;l++)
                {
                    if(i<=4){
                        if(i%2==0)
                        {

                            alpha[i][l]= word.get(j).charAt(l);
                        }

                        else if(i%2!=0)
                        {

                            alpha[l][i]= word.get(j).charAt(l);

                        }
                        i++;
                    }
                    else break;
                }

            }
            if(size==15)
            {
                for(int i=0, j=0;j<=7;j++)
                {
                    if(i<=7)
                    {
                        word.get(j);
                        int len= word.get(j).length();
                        System.out.println(word.get(j));
                        if(i%2==0)
                        {
                            for(int l=0;l<len;l++)
                            {
                                alpha[i][l]= word.get(j).charAt(l);
                            }
                        }
                        else if(i%2!=0)
                        {
                            i++;
                            for(int l=0;l<len;l++)
                            {

                                alpha[l][i]= word.get(j).charAt(l);

                            }
                            i--;
                        }
                        i++;
                    }
                    else break;
                }
            }if(size==25)
        {
            for(int i=0, j=0;j<=10;j++)
            {
                if(i<=10)
                {
                    word.get(j);
                    int len= word.get(j).length();
                    System.out.println(word.get(j));
                    if(i%2==0)
                    {
                        for(int l=0;l<len;l++)
                        {
                            alpha[i][l]= word.get(j).charAt(l);
                        }
                    }
                    else if(i%2!=0)
                    {
                        i++;
                        for(int l=0;l<len;l++)
                        {

                            alpha[l][i]= word.get(j).charAt(l);

                        }
                        i--;
                    }
                    i++;
                }
                else break;
            }
        }
            for(int i=0;i<size;i++)
            {
                for(int j=0;j<size;j++)
                {
                    System.out.print(alpha[i][j]+"\t");
                }
                System.out.println();
            }
            String move;
            char ans;
            /*while(listItr.hasNext()) {
            System.out.print(listItr.next() + ", ");
            }*/
            for(int i=0;i<5;i++)
            {
                System.out.println("enter position for the first letter of any word u spot (first row then coloumn format)");
                r=scs.nextInt();
                c=scs.nextInt();
                ans=alpha[r][c];
                System.out.println("enter the next move out of 6 options up/down/left/right/diagonalup/diagonaldown");
                //move=scs.next();


                for(int j=0;j<15;j++)
                {
                   button2.addActionListener(e->{                //move up
                       int f=-1;
                       int f1=0;
                   });
                   button3.addActionListener(e->{               //move down
                       int f=1;
                       int f1=0;

                   });

                   button4.addActionListener(e->{              //move left
                        int f=0;
                        int f1=-1;
                   });

                   button5.addActionListener(e->{               //move right
                        int f=0;
                        int f1=1;
                   });
                   c++;
                   /*
                    if(move=="diagonalup")
                    {
                        r--;
                        c--;
                    }
                    if(move=="diagonaldown")
                    {
                        c++;
                        r++;
                    }*/
                    ans=(char)(ans+alpha[r][c]);
                    System.out.println(ans);
                    /*while(listItr.hasNext())
                    {
                        String str1 = new Boolean(listItr.hasNext()). toString();
                        String str2=Character.toString(ans);
                        System.out.println("\t"+str2);
                        if(str2==str1)
                        {
                            System.out.println("good job\t"+ans);
                            break;
                        }

                    }*/
                    System.out.println("enter the next move");
                   // move=scs.next();
                }
                //System.out.println("TIME UP!!!!!");
            }

        }
        /* private void findWordsDiagonal(int r, int c, Dictionary d, int minLen)
        {
        String word = "";

        while (c < getWidth() && r < getHeight())
        {
        word = word + Character.toLowerCase(getLetter(r, c));
        if (word.length() >= minLen && d.contains(word))
        System.out.println(word);

        c++;
        r++;
        }
        }

        private void findWordsHorizontal(int r, int c, Dictionary d, int minLen)
        {
        String word = "";

        while (c < getWidth())
        {
        word = word + Character.toLowerCase(getLetter(r, c));
        if (word.length() >= minLen && d.contains(word))
        System.out.println(word);

        c++;
        }
        }

        private void findWordsVertical(int r, int c, Dictionary d, int minLen)
        {
        String word = "";

        while (r < getHeight())
        {
        word = word + Character.toLowerCase(getLetter(r, c));
        if (word.length() >= minLen && d.contains(word))
        System.out.println(word);

        r++;
        }
        }*/

    }
}