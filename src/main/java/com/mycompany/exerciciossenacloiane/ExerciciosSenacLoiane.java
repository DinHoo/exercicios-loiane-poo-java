package com.mycompany.exerciciossenacloiane;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ExerciciosSenacLoiane {

    public static void main(String[] args) {
        //setup pra usar random
        Random rand = new Random();
        //------------------------------------------------
        /*
        Criar um vetor A com 5 elementos inteiros. Construir um vetor B de
        mesmo tipo e tamanho e com os "mesmos" elementos do vetor A, ou
        seja, B[i] = A[i].
        */
        System.out.println("Exercicio 1");
        
        //int[] vetorA = new int[5];
        //int[] vetorB = new int[5];
        ArrayList<Integer> vetorA1 = new ArrayList();
        ArrayList<Integer> vetorB1 = new ArrayList();
                
        for (int i = 0; i < 5; i++) {
            vetorA1.add(10+i);
        }
        System.out.println(vetorA1);
        
        for (int i = 0; i < 5; i++) {
            vetorB1.add(vetorA1.get(i));
        }
        System.out.println(vetorB1);
        
        if (vetorA1.equals(vetorB1)) {
            System.out.println("São iguais");
        } else {
            System.out.println("São diferentes");
        }
        
        //String resultado = (vetorA.equals(vetorB))? "São iguais" : "Não são iguai";
        //System.out.println(resultado);
        
        System.out.println(" ");
        System.out.println("------------------------------------------------------------------------");
        System.out.println(" ");
        
        //------------------------------------------------
        /*
        Criar um vetor A com 8 elementos inteiros. Construir um vetor B de
        mesmo tipo e tamanho e com os elementos do vetor A multiplicados
        por 2, ou seja: B[i] = A[i] * 2.
        */
        System.out.println("Exercicio 2");
        //criando as listas vazias
        ArrayList<Integer> vetorA2 = new ArrayList();
        ArrayList<Integer> vetorB2 = new ArrayList();
                
        for (int i = 0; i < 8; i++) {
            vetorA2.add(5+i);
        }
        System.out.println(vetorA2);
        
        for (int i = 0; i < 8; i++) {
            vetorB2.add(vetorA2.get(i)*2);
        }
        System.out.println(vetorB2);
        
        //checar se são iguais
        boolean flag = true;
        for (int i = 0; i < 8; i++){
            int a = vetorA2.get(i);
            int b = vetorB2.get(i);
            a = a*2;
            if (a!=b) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("O vetor B2 é o dobro do vetor A2");
        } else {
            System.out.println("O vetor B2 NÃO é o dobro do vetor A2");
        }
        
        /*
        não sei como fazer
        if (vetorA2.equals((vetorB2)*2)) {
            System.out.println("São iguais");
        } else {
            System.out.println("São diferentes");
        }
        */
        
        System.out.println();
        System.out.println("------------------------------------------------------------------------");
        System.out.println();
        
        //------------------------------------------------
        /*
        Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
        mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
        ser o quadrado do respectivo elemento de A, ou seja:
        B[i] = A[i] * A[I].
        */
        System.out.println("Exercicio 3");
        
        int[] vetorA3 = new int[15];
        int[] vetorB3 = new int[15];
    
        for (int i = 0; i < vetorA3.length; i++) {
            vetorA3[i] = 21+i;
        }
        System.out.println(Arrays.toString(vetorA3));
         for (int i = 0; i < vetorB3.length; i++) {
            vetorB3[i] = (int) Math.pow(vetorA3[i], 2);
        }
        System.out.println(Arrays.toString(vetorB3));
        
        System.out.println();
        System.out.println("------------------------------------------------------------------------");
        System.out.println();
        
        //------------------------------------------------
        /*
        Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
        mesmo tamanho, sendo que cada elemento do vetor B deverá ser a
        raiz quadrada do respectivo elemento de A, ou seja:
        B[i] = sqrt(A[i]).
        */
        System.out.println("Exercicio 4");
        int aux = 101; //criei a variavel pro random
        
        ArrayList<Integer> vetorA4 = new ArrayList();
        ArrayList<Float> vetorB4 = new ArrayList();
        
        for (int i = 0; i < 15; i++) {
            vetorA4.add(rand.nextInt(aux));            
        }
        System.out.println(vetorA4);
        for (Integer i : vetorA4) {
            vetorB4.add((float)Math.sqrt(i));
        }
        System.out.println(vetorB4);
        
        System.out.println();
        System.out.println("------------------------------------------------------------------------");
        System.out.println();
        
        //------------------------------------------------
        /*
        Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
        mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
        ser o respectivo elemento de A multiplicado por sua posição (ou
        índice), ou seja:
        B[i] = A[i] * i.
        */
        System.out.println("Exercicio 5");
        
        ArrayList<Float> vetorA5 = new ArrayList();
        ArrayList<Float> vetorB5 = new ArrayList();
        
        for (int i = 0; i < 10; i++) {
            vetorA5.add((float)rand.nextInt(aux));            
        }
        System.out.println(vetorA5);
        for (int i = 0; i < vetorA5.size(); i++) {
            vetorB5.add(vetorA5.get(i)*i);
        }
        System.out.println(vetorB5);
        
        System.out.println();
        System.out.println("------------------------------------------------------------------------");
        System.out.println();
        
        //------------------------------------------------
        /*
        Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
        um vetor C, onde cada elemento de C é a soma dos respectivos
        elementos em A e B, ou seja:
        C[i] = A[i] + B[i].
        */
        System.out.println("Exercicio 6");
        
        ArrayList<Integer> vetorA6 = new ArrayList();
        ArrayList<Integer> vetorB6 = new ArrayList();
        ArrayList<Integer> vetorC6 = new ArrayList();
        
        for (int i = 0; i < 10; i++) {
            vetorA6.add(rand.nextInt(aux));
            vetorB6.add(rand.nextInt(aux));
        }
        for (int i = 0; i < vetorA6.size(); i++) {
            vetorC6.add(vetorA6.get(i) + vetorB6.get(i));            
        }
        System.out.println(vetorA6);
        System.out.println(vetorB6);
        System.out.println(vetorC6);
        
        System.out.println();
        System.out.println("------------------------------------------------------------------------");
        System.out.println();
        
        //------------------------------------------------
        /*
        Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
        um vetor C, onde cada elemento de C é a soma dos respectivos
        elementos em A e B, ou seja:
        C[i] = A[i] - B[i].
        */
        System.out.println("Exercicio 7");
        
        ArrayList<Integer> vetorA7 = new ArrayList();
        ArrayList<Integer> vetorB7 = new ArrayList();
        ArrayList<Integer> vetorC7 = new ArrayList();
        
        for (int i = 0; i < 10; i++) {
            vetorA7.add(rand.nextInt(aux));
            vetorB7.add(rand.nextInt(aux));
        }
        for (int i = 0; i < vetorA7.size(); i++) {
            vetorC7.add(vetorA7.get(i) - vetorB7.get(i));            
        }
        System.out.println(vetorA7);
        System.out.println(vetorB7);
        System.out.println(vetorC7);
        
        System.out.println();
        System.out.println("------------------------------------------------------------------------");
        System.out.println();
        
        //------------------------------------------------
        /*
        Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
        um vetor C, onde cada elemento de C é a soma dos respectivos
        elementos em A e B, ou seja:
        C[i] = A[i] * B[i].
        */
        System.out.println("Exercicio 8");
        
        ArrayList<Integer> vetorA8 = new ArrayList();
        ArrayList<Integer> vetorB8 = new ArrayList();
        ArrayList<Integer> vetorC8 = new ArrayList();
        
        for (int i = 0; i < 10; i++) {
            vetorA8.add(rand.nextInt(aux));
            vetorB8.add(rand.nextInt(aux));
        }
        for (int i = 0; i < vetorA8.size(); i++) {
            vetorC8.add(vetorA8.get(i) * vetorB8.get(i));            
        }
        System.out.println(vetorA8);
        System.out.println(vetorB8);
        System.out.println(vetorC8);
        
        System.out.println();
        System.out.println("------------------------------------------------------------------------");
        System.out.println();
        
        //------------------------------------------------
        /*
        Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
        um vetor C, onde cada elemento de C é a soma dos respectivos
        elementos em A e B, ou seja:
        C[i] = A[i] / (float)B[i].
        */
        System.out.println("Exercicio 9");
        
        ArrayList<Integer> vetorA9 = new ArrayList();
        ArrayList<Integer> vetorB9 = new ArrayList();
        ArrayList<Float> vetorC9 = new ArrayList();
        
        for (int i = 0; i < 10; i++) {
            vetorA9.add(rand.nextInt(aux));
            vetorB9.add(rand.nextInt(aux));
        }
        for (int i = 0; i < vetorA9.size(); i++) {
            vetorC9.add( vetorA9.get(i)/ (float)(vetorB9.get(i)));            
        }
        System.out.println(vetorA9);
        System.out.println(vetorB9);
        System.out.println(vetorC9);
        
        System.out.println();
        System.out.println("------------------------------------------------------------------------");
        System.out.println();
        
        //------------------------------------------------
        /*
        Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
        mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
        ser o resto da divisão do respectivo elemento de A por 2 (dois), ou
        seja: B[i] := A[i] % 2.
        */
        System.out.println("Exercicio 10");
        
        ArrayList<Integer> vetorA10 = new ArrayList();
        ArrayList<Float> vetorB10 = new ArrayList();
        
        for (int i = 0; i < 10; i++) {
            vetorA10.add(rand.nextInt(aux));            
        }
        System.out.println(vetorA10);
        for (int i = 0; i < vetorA10.size(); i++) {
            vetorB10.add((float)vetorA10.get(i)%2);
        }
        System.out.println(vetorB10);
        
        System.out.println();
        System.out.println("------------------------------------------------------------------------");
        System.out.println();
        
        //------------------------------------------------
        /*
        Criar um vetor A com 10 elementos inteiros. Implementar um programa
        que defina e escreva a quantidade de elementos armazenados neste
        vetor que são pares.
        */
        System.out.println("Exercicio 11");
        
        ArrayList<Integer> vetorA11 = new ArrayList();

        for (int i = 0; i < 10; i++) {
            vetorA11.add(rand.nextInt(aux));            
        }
        System.out.println(vetorA11);
        
        int contadorPares = 0;
        
        for (Integer i : vetorA11) {
            if (i%2 == 0) {
                contadorPares++;
            }
        }
        System.out.printf("Foram encontrados %d numeros pares\n",contadorPares);
        
        System.out.println();
        System.out.println("------------------------------------------------------------------------");
        System.out.println();
        
        //------------------------------------------------
        /*
        Criar um vetor A com 10 elementos inteiros. Implementar um programa
        que defina e escreva a soma de todos os elementos armazenados
        neste vetor.
        */
        System.out.println("Exercicio 12");
        
        ArrayList<Integer> vetorA12 = new ArrayList();

        for (int i = 0; i < 10; i++) {
            vetorA12.add(rand.nextInt(aux));            
        }
        System.out.println(vetorA12);
        
        int somaTodes = 0;
        
        for (Integer i : vetorA12) {
            somaTodes += i;
        }
        System.out.printf("A soma de todos os numeros do vetor é igual a %d\n", somaTodes);
        
        System.out.println();
        System.out.println("------------------------------------------------------------------------");
        System.out.println();
        
        /*
        Criar um vetor A com 10 elementos inteiros. Implementar um programa
        que determine a soma dos elementos armazenados neste vetor que
        são múltiplos de 5.
        */
        System.out.println("Exercicio 13");
        
        ArrayList<Integer> vetorA13 = new ArrayList();

        for (int i = 0; i < 10; i++) {
            vetorA13.add(rand.nextInt(aux));            
        }
        System.out.println(vetorA13);
        
        int somaMultiplo5 = 0;
        
        for (Integer i : vetorA13) {
            if (i%5 == 0) {
                somaMultiplo5 += i;
            }
        }
        System.out.printf("A soma de todos os numeros multiplos de 5 do vetor é igual a %d\n", somaMultiplo5);
        
        System.out.println();
        System.out.println("------------------------------------------------------------------------");
        System.out.println();
        
        //------------------------------------------------
        /*
        Criar um vetor A com 10 elementos inteiros. Implementar um programa
        que defina e escreva a média aritmética simples dos elementos
        ímpares armazenados neste vetor.
        */
        System.out.println("Exercicio 14");
        
        ArrayList<Integer> vetorA14 = new ArrayList();

        for (int i = 0; i < 10; i++) {
            vetorA14.add(rand.nextInt(aux));            
        }
        System.out.println(vetorA14);
        
        float mediaImpares = 0;
        int contadorImpares = 0;
        
        for (Integer i : vetorA14) {
            if (i%2 == 1) {
                mediaImpares += i;
                contadorImpares++;
            }
        }
        
        mediaImpares = mediaImpares/contadorImpares;
        System.out.println(mediaImpares);
        
        System.out.println();
        System.out.println("------------------------------------------------------------------------");
        System.out.println();
        
        //------------------------------------------------
        /*
        Criar um vetor A com 10 elementos inteiros. Desenvolver um programa
        que defina o percentual de elementos pares e ímpares,
        respectivamente, armazenados neste vetor.
        */
        System.out.println("Exercicio 15");
        
        ArrayList<Integer> vetorA15 = new ArrayList();
        
        float contadorPares15 = 0;
        float contadorImpares15 = 0;
        
        for (int i = 0; i < 10; i++) {
            vetorA15.add(rand.nextInt(aux));
            if (vetorA15.get(i)%2 == 0) {
                contadorPares15++;
            } else {
                contadorImpares15++;
            }
        }
        System.out.println(vetorA15);
        //System.out.println(contadorPares15);
        //System.out.println(contadorImpares15);
        contadorPares15 = (contadorPares15*100)/vetorA15.size();
        contadorImpares15 = (contadorImpares15*100)/vetorA15.size();
        
        System.out.printf("No vetor %.1f%% são Pares e %.1f%% são impares\n",contadorPares15, contadorImpares15);
                
        System.out.println();
        System.out.println("------------------------------------------------------------------------");
        System.out.println();
        
        //------------------------------------------------
        /*
        Criar um vetor A com 10 elementos inteiros. Escrever um programa
        que calcule e escreva: 
        a) a soma de elementos armazenados neste
        vetor que são inferiores a 15; 
        b) a quantidade de elementos
        armazenados no vetor que são iguais a 15;
        c) a média dos
        elementos armazenados no vetor que são superiores a 15.
        */
        System.out.println("Exercicio 16");
        //modificar o rando pra ir de 0 a 30 nesse exercicio
        aux = 31;
        
        ArrayList<Integer> vetorA16 = new ArrayList();
        int contador16 = 0;
        int contador16MaiorQ15 = 0;
        int soma16 = 0;
        float media16 = 0;
        
        for (int i = 0; i < 10; i++) {
            vetorA16.add(rand.nextInt(aux));
            if (vetorA16.get(i)==15) {
                contador16++;
            } else {
                if (vetorA16.get(i)<15) {
                    soma16 += vetorA16.get(i);
                } else {
                    media16 += vetorA16.get(i);
                    contador16MaiorQ15++;
                }
            }
        }
        
        media16 = media16/contador16MaiorQ15;
        
        System.out.println(vetorA16);
        System.out.printf("%d numeros no vetor são iguais a 15\n",contador16);
        System.out.printf("%d é o total da soma dos numeros que são menores que 15\n",soma16);
        System.out.printf("%f media dos numeros que são maiores que 15\n",media16);
                
        System.out.println();
        System.out.println("------------------------------------------------------------------------");
        System.out.println();
        
        //------------------------------------------------
        /*
        Ler um vetor A com 10 elementos inteiros correspondentes as idades
        de um grupo de pessoas. Escreva um programa que determine e
        escreva a quantidade de pessoas que possuem idade superior a 35
        anos.
        */
        System.out.println("Exercicio 17");
        //modificar o rando pra ir de 0 a 80 nesse exercicio
        aux = 81;
        
        ArrayList<Integer> vetorA17 = new ArrayList();
        int contador17 = 0;
        
        for (int i = 0; i < 10; i++) {
            vetorA17.add(rand.nextInt(aux));
            if (vetorA17.get(i)>35) {
                contador17++;
            }
        }
        System.out.println(vetorA17);
        System.out.println(contador17 + " pessoas tem idade superior a 35 anos");
        
        System.out.println();
        System.out.println("------------------------------------------------------------------------");
        System.out.println();
        
        //------------------------------------------------
        /*
        Ler um vetor A com 10 elementos inteiros correspondentes as idades
        de um grupo de pessoas. Escreva um programa que determine e
        escreva a menor e a maior idades e suas respectivas posições.
        */
        System.out.println("Exercicio 18");
        //modificar o rando pra ir de 0 a 80 nesse exercicio
        aux = 81;
        
        ArrayList<Integer> vetorA18 = new ArrayList();
        int maior18 = 0;
        int menor18 = 0;
        int posicaoMaior18 = 0;
        int posicaoMenor18 = 0;
        
        boolean primeiro18 = true;
        
        for (int i = 0; i < 10; i++) {
            vetorA18.add(rand.nextInt(aux));
            if (vetorA18.get(i)>maior18) {
                maior18 = vetorA18.get(i);
            } else {
                if (vetorA18.get(i)<menor18 || primeiro18) {
                    primeiro18 = false;
                    menor18 = vetorA18.get(i);
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            if (vetorA18.get(i)==maior18) {
                posicaoMaior18 = i;
            }
            if (vetorA18.get(i)==menor1818) {
                posicaoMenor18 = i;
            }
        }
        
        
        System.out.println(vetorA18);
        System.out.println(maior18);
        System.out.println(menor18);
        
        System.out.println();
        System.out.println("------------------------------------------------------------------------");
        System.out.println();
        
        //------------------------------------------------
        /*
        Ler as duas notas bimestrais para um conjunto de 10 alunos.
        Armazenar as notas informadas em dois vetores “Nota1” e “Nota2” do
        tipo real. Escreva um programa que calcule a média aritmética simples
        das notas informadas armazenando o resultado em um vetor “Result”
        de mesmo tipo e tamanho. Ao mostrar os resultados exibir a situação
        de cada aluno. Se a média calculada for superior ou igual a 7 o aluno
        estará “aprovado”, caso contrário, a situação do aluno será
        “reprovado”.
        */
        System.out.println("Exercicio 19");
        //modificar o rando pra ir de 0 a 10 nesse exercicio
        aux = 9;
        
        ArrayList<Float> vetorA19Nota1 = new ArrayList();
        ArrayList<Float> vetorA19Nota2 = new ArrayList();
        ArrayList<Float> vetorA19Result = new ArrayList();
        
        for (int i = 0; i < 10; i++) {
            vetorA19Nota1.add(((float)rand.nextInt(aux))+2);
            vetorA19Nota2.add(((float)rand.nextInt(aux))+2);
            vetorA19Result.add((vetorA19Nota1.get(i)+vetorA19Nota2.get(i))/2);
        }
        
        int ordem19 = 0;
        for (Float nota : vetorA19Result) {
            ordem19++;
            if (nota>7) {
                System.out.printf("A nota do aluno numero: %2d é %2.2f logo ele está Aprovado\n", ordem19, nota);
            } else {
                System.out.printf("A nota do aluno numero: %2d é %2.2f logo ele está Reprovado\n", ordem19, nota);
            }
        }
        
        System.out.println(vetorA19Nota1);
        System.out.println(vetorA19Nota2);
        //System.out.println(vetorA19Result);
        
        
        System.out.println();
        System.out.println("------------------------------------------------------------------------");
        System.out.println();
        
        //------------------------------------------------
        /*
        Implementar um programa que obtenha a cotação do dólar (U$) em
        relação ao real (R$) e a seguir armazene em vetor A com 20
        elementos as seguintes conversões:
        
        21. A[i] = cotação do dolar * i, para todo i variando de 1 até 20.
        */
        System.out.println("Exercicio 20 e 21");
        
        Scanner scan = new Scanner(System.in);
        double cotacao20 = 0; 
        ArrayList<Double> vetorA201 = new ArrayList();
        
        System.out.println("Qual a cotação do dolar hoje?");
        
        //cotacao20 = scan.nextDouble();
        cotacao20 = 5.3d;
        
        for (int i = 0; i < 20; i++) {
            vetorA201.add(cotacao20*(i+1));
        }
        System.out.println("Cotações: "+vetorA201);
        
        
    }
    
}
