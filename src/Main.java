public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    static void task1()
    {
        System.out.println("Задание 1");

        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;

        double[] arr2 = {1.57, 7.654, 9.986};

        boolean[] arr3 = new boolean[3];
        arr3[2] = true;
        System.out.println("---\n");
    }

    static void task2()
    {
        System.out.println("Задание 2");

        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        for (var element : arr1)
        {
            if(arr1[arr1.length-1] != element)
                System.out.print(element +", ");
            else
                System.out.print(element+"\n");
        }

        double[] arr2 = {1.57, 7.654, 9.986};
        for (var element : arr2)
        {
            if(arr2[arr2.length-1] != element)
                System.out.print(element +", ");
            else
                System.out.print(element+"\n");
        }

        boolean[] arr3 = new boolean[3];
        arr3[2] = true;
        for (var element : arr3)
        {
            if(arr3[arr3.length-1] != element)
                System.out.print(element +", ");
            else
                System.out.print(element+"\n");
        }
        System.out.println("---\n");
    }


    static void task3()
    {
        System.out.println("Задание 3");
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;

        double[] arr2 = {1.57, 7.654, 9.986};

        boolean[] arr3 = new boolean[3];
        arr3[2] = true;

        for(int i = arr1.length-1; i >= 0; i--)
        {
            if(i != 0)
                System.out.print(arr1[i] +", ");
            else
                System.out.print(arr1[i]+"\n");
        }

        for(int i = arr2.length-1; i >= 0; i--)
        {
            if(i != 0)
                System.out.print(arr2[i] +", ");
            else
                System.out.print(arr2[i]+"\n");
        }

        for(int i = arr3.length-1; i >= 0; i--)
        {
            if(i != 0)
                System.out.print(arr3[i] +", ");
            else
                System.out.print(arr3[i]+"\n");
        }
        System.out.println("---\n");
    }

    static void task4()
    {
        System.out.println("Задание 4");

        int[] arr = {4,523,655,3,2,6,88,1};

        for (var i = 0; i < arr.length; i++)
        {
            if(arr[i] % 2 !=0)
                arr[i] = arr[i] + 1;
        }

        for (var i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + ",");
        }
        System.out.println("---\n");
    }
}