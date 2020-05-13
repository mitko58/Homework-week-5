import java.util.Random;
import java.util.Scanner;

public class HomeworkWeek5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isSystemOn = true;
        System.out.println("Колко на брой числа ще въвеждате?");
        int numbers = Integer.parseInt(scanner.nextLine());
        int[] arrayOfNumbers = new int[numbers];
        System.out.println("Въведените числа не трябва да са по-малки от 0 и по-големи от 100");
        int countNumber = 1;
        for (int i = 0; i < numbers; ) {
            arrayOfNumbers[i] = Integer.parseInt(scanner.nextLine());
            if (arrayOfNumbers[i] > 0 && arrayOfNumbers[i] < 100) {
                i++;
                countNumber++;
            } else {
                System.out.println("Числото не е между 0 и 100");
            }
        }
        while (isSystemOn) {
            System.out.println("Изберете опция");
            options();
            int numberOfOption = Integer.parseInt(scanner.nextLine());
            if (numberOfOption == 1) {
                ascendingSort(arrayOfNumbers);
                continueProgram();
                break;
            } else if (numberOfOption == 2) {
                descendingSort(arrayOfNumbers);
                continueProgram();
                break;
            } else if (numberOfOption == 3) {
                positionOfNumber(arrayOfNumbers);
                continueProgram();
                break;
            } else if (numberOfOption == 4) {
                mixNumber(arrayOfNumbers);
                continueProgram();
                break;
            } else if (numberOfOption == 5) {
                sumNumbers(arrayOfNumbers);
                continueProgram();
                break;
            } else if (numberOfOption == 6) {
                biggestNumber(arrayOfNumbers);
                continueProgram();
                break;
            } else if (numberOfOption == 7) {
                smallestNumber(arrayOfNumbers);
                continueProgram();
                break;
            } else if (numberOfOption == 8) {
                averageOfNumbers(arrayOfNumbers);
                continueProgram();
                break;
            } else if (numberOfOption == 9) {
                symmetricArray(arrayOfNumbers);
                continueProgram();
                break;
            } else if (numberOfOption == 10) {
                reverseArray(arrayOfNumbers);
                continueProgram();
                break;
            } else if (numberOfOption == 11) {
                enteredNumbers(arrayOfNumbers);
                continueProgram();
                break;
            } else if (numberOfOption == 12) {
                isSystemOn = false;
                System.out.println("Приключихте работа с програмата");
                break;
            }
        }
    }

    private static void continueProgram() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Желаете ли да се върнете в началното меню?");
        String string = scanner.nextLine();
        boolean isSystemOn = true;
        if (string.equals("Да")) {
            System.out.println("Колко на брой числа ще въвеждате?");
            int numbers = Integer.parseInt(scanner.nextLine());
            int[] arrayOfNumbers = new int[numbers];
            System.out.println("Въведените числа не трябва да са по-малки от 0 и по-големи от 100");
            int countNumber = 1;
            for (int i = 0; i < numbers; ) {
                arrayOfNumbers[i] = Integer.parseInt(scanner.nextLine());
                if (arrayOfNumbers[i] > 0 && arrayOfNumbers[i] < 100) {
                    i++;
                    countNumber++;
                } else {
                    System.out.println("Числото не е между 0 и 100");
                }
            }
            while (isSystemOn) {
                System.out.println("Изберете опция");
                options();
                int numberOfOption = Integer.parseInt(scanner.nextLine());
                if (numberOfOption == 1) {
                    ascendingSort(arrayOfNumbers);
                    continueProgram();
                    break;
                } else if (numberOfOption == 2) {
                    descendingSort(arrayOfNumbers);
                    continueProgram();
                    break;
                } else if (numberOfOption == 3) {
                    positionOfNumber(arrayOfNumbers);
                    continueProgram();
                    break;
                } else if (numberOfOption == 4) {
                    mixNumber(arrayOfNumbers);
                    continueProgram();
                    break;
                } else if (numberOfOption == 5) {
                    sumNumbers(arrayOfNumbers);
                    continueProgram();
                    break;
                } else if (numberOfOption == 6) {
                    biggestNumber(arrayOfNumbers);
                    continueProgram();
                    break;
                } else if (numberOfOption == 7) {
                    smallestNumber(arrayOfNumbers);
                    continueProgram();
                    break;
                } else if (numberOfOption == 8) {
                    averageOfNumbers(arrayOfNumbers);
                    continueProgram();
                    break;
                } else if (numberOfOption == 9) {
                    symmetricArray(arrayOfNumbers);
                    continueProgram();
                    break;
                } else if (numberOfOption == 10) {
                    reverseArray(arrayOfNumbers);
                    continueProgram();
                    break;
                } else if (numberOfOption == 11) {
                    enteredNumbers(arrayOfNumbers);
                    continueProgram();
                    break;
                } else if (numberOfOption == 12) {
                    isSystemOn = false;
                    System.out.println("Приключихте работа с програмата");
                    break;
                }
            }
        }else{
            isSystemOn = false;
            System.out.println("Приключихте работа с програмата");
        }
    }

    private static void enteredNumbers(int[] arrayOfNumbers) {
        for (int elements: arrayOfNumbers){
            System.out.printf("%d ", elements);
        }
        System.out.println();
    }

    private static void reverseArray(int[] arrayOfNumbers) {
        int element;
        for (int i = 0; i < arrayOfNumbers.length / 2; i++) {
            element = arrayOfNumbers[i];
            arrayOfNumbers[i] = arrayOfNumbers[arrayOfNumbers.length - i - 1];
            arrayOfNumbers[arrayOfNumbers.length - i - 1] = element;
        }
        for (int elements : arrayOfNumbers) {
            System.out.printf("%d ", elements);
        }
        System.out.println();
    }

    private static void symmetricArray(int[] arrayOfNumbers) {
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            if (i > arrayOfNumbers.length / 2) {
                System.out.println("Масивът е симетричен");
                for (int elements : arrayOfNumbers) {
                    System.out.printf("%d ", elements);
                }
                System.out.println();
                break;

            } else if (arrayOfNumbers[i] != arrayOfNumbers[arrayOfNumbers.length - 1 - i]) {
                System.out.println("Масивът не е симетричен");
                for (int elements : arrayOfNumbers) {
                    System.out.printf("%d ", elements);
                }
                System.out.println();
                break;
            }
        }
    }

    private static void averageOfNumbers(int[] arrayOfNumbers) {
        double sum = 0;
        double average = 0;
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            sum += arrayOfNumbers[i];
            average = sum / arrayOfNumbers.length;
        }
        System.out.printf("Средно аритметичното на всички числа е %.2f", average);
        System.out.println();
    }

    private static void smallestNumber(int[] arrayOfNumbers) {
        int smallestNumber = 100;
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            if (smallestNumber > arrayOfNumbers[i])
                smallestNumber = arrayOfNumbers[i];
        }
        System.out.printf("Най-малкото число е %d", smallestNumber);
        System.out.println();
    }

    private static void biggestNumber(int[] arrayOfNumber) {
        int biggestNumber = 0;
        for (int i = 0; i < arrayOfNumber.length; i++) {
            if (biggestNumber < arrayOfNumber[i])
                biggestNumber = arrayOfNumber[i];
        }
        System.out.printf("Най-голямото число е %d", biggestNumber);
        System.out.println();
    }

    private static void sumNumbers(int[] arrayOfNumbers) {
        int sumOfAllNumbers = 0;
        for (int arrayOfNumber : arrayOfNumbers) {
            sumOfAllNumbers += arrayOfNumber;
        }
        System.out.printf("Сумата на всички числа е %d", sumOfAllNumbers);
        System.out.println();
    }

    private static void mixNumber(int[] arrayOfNumbers) {
        Random random = new Random();
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            int randomNumber = random.nextInt(arrayOfNumbers.length);
            int element = arrayOfNumbers[i];
            arrayOfNumbers[i] = arrayOfNumbers[randomNumber];
            arrayOfNumbers[randomNumber] = element;
        }
        for (int elements : arrayOfNumbers) {
            System.out.printf("%d ", elements);
        }
        System.out.println();
    }

    private static void positionOfNumber(int[] arrayOfNumbers) {
        System.out.println("Въведете числото, чиято позиция искате да намерите");
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int position = 0;
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            if (arrayOfNumbers[i] == number) {
                position = i;
                System.out.printf("Числото %d е намерено на позиция %d", number, position);
                System.out.println();
            }
        }
    }

    private static void descendingSort(int[] arrayOfNumbers) {
        int element;
        for (int i = 0; i < arrayOfNumbers.length - 1; i++) {
            for (int j = 0; j < arrayOfNumbers.length - i - 1; j++) {
                if (arrayOfNumbers[j] < arrayOfNumbers[j + 1]) {
                    int elements = arrayOfNumbers[j];
                    arrayOfNumbers[j] = arrayOfNumbers[j + 1];
                    arrayOfNumbers[j + 1] = elements;
                }
            }
        }
        for (int elements : arrayOfNumbers) {
            System.out.printf("%d ", elements);
        }
        System.out.println();
    }

    private static void ascendingSort(int[] arrayOfNumbers) {
        int length = arrayOfNumbers.length;
        int element;
        for (int i = 1; i < length; i++) {
            for (int j = length - 1; j >= i; j--) {
                if (arrayOfNumbers[j - 1] > arrayOfNumbers[j]) {
                    element = arrayOfNumbers[j - 1];
                    arrayOfNumbers[j - 1] = arrayOfNumbers[j];
                    arrayOfNumbers[j] = element;
                }
            }
        }
        for (int elements : arrayOfNumbers) {
            System.out.printf("%d ", elements);
        }
        System.out.println();
    }

    private static void options() {
        System.out.println("1. Сортиране на въведените числа във възходящ ред");
        System.out.println("2. Сортиране на въведените числа в низходящ ред");
        System.out.println("3. Търсене на позиция на конкретно число");
        System.out.println("4. Разбъркване на числата");
        System.out.println("5. Изчисляване на сбора на всички числа");
        System.out.println("6. Намиране на най-голямото число");
        System.out.println("7. Намиране на най-малкото число");
        System.out.println("8. Намиране средно-аритметично на числата");
        System.out.println("9. Проверка за симетричност на масива от числа");//
        System.out.println("10. Обръщане на масива от числа");
        System.out.println("11. Визуализирай въведените числа");
        System.out.println("12. Изход");
    }
}


