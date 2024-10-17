import java.lang.Math;
class Login 
{
   static java.util.Scanner sc = new java.util.Scanner(System.in);
    static String def = "\u001B[0m";
    static String blink = "\u001B[5m";
    static String red = "\u001B[31m";
    static String green = "\u001B[32m";
    static String yellow = "\u001B[33m";
    static String blue = "\u001B[34m";
    static String purpe = "\u001B[35m";
    static String skblue = "\u001B[36m";
    static int min = 1001;
    static int max = 9999;
    static int rotp = (int)(Math.random()*(max-min+1)+min);
    static int n1 = 0;
    static Bill bl1 = new Bill();
    public static void main(String [] args)
   {
       Login l1 = new Login();
        n1++;
        if(n1==1)
        System.out.print(skblue);
        System.out.println("");
        System.out.print(yellow);
        System.out.print(blink);
        System.out.println("----------WELCOME TO FOODFRENZY-----------");
        System.out.println("*         The #1 Food Delivery App         *");
        System.out.print(def);
        System.out.print(skblue);        
        System.out.println("");
        System.out.print(blue);
        System.out.println("Please Enter Mobile Number to Continue");
        l1.pn(sc.nextLong());
   }
   void pn(long num)
   {
        if(num<1000000000l || num>9999999999l)
        {
        System.out.println("Invalid Phone Number Please Enter Again");
        pn(sc.nextLong());
        }
        else
        {
            System.out.println("OTP Sent Successfully!");
            System.out.printf("Your OTP: %d\n",rotp);
            System.out.println("Enter the OTP recieved");
            otp(sc.nextInt());
        }
   }
   void otp(int otp1)
   {
            if(otp1==rotp)
            {
            System.out.println("------LOGIN SUCCESFULL------");
            new Main().main();
            }
            else
            {
            System.out.println("Invalid OTP Please Enter Again");
            otp(sc.nextInt());
            }
   }
}
class Main extends Login
{
    static double bill = 0;
    void main()
    {
        System.out.print(yellow);
        System.out.println("Please Select a Place to Order From");
        System.out.println("1.Restaurant");
        System.out.println("2.Bakery");
        System.out.println("3.Milkshakes Corner");
        System.out.println("4.Fruit Juice Corner");
        int n = sc.nextInt();
        switch(n)
        {
            case 1:
                {
                    Rest r1 = new Rest();
                    r1.menu();
                    break;
                }
            case 2:
                {
                    Bakery b1 = new Bakery();
                    b1.bakelist();
                    break;
                }
            case 3:
                {
                    Milkshake m1 = new Milkshake();
                    m1.milklist();
                    break;
                }
            case 4:
                {
                    juice j1 = new juice();
                    j1.fruit();
                    break;
                }
            default:
            {
                System.out.println("Invalid Selection, Please Select again");
                main();
            }
        }
    }
}
class Bill extends Main
{
     void fbill(double bil)
    {
        new Main().main();
    }
    void billd(double billf)
    {
        System.out.println("------BILL DETAILS------");
        System.out.printf("Bill        : %.2f\n",billf);
        System.out.printf("GST         : %.2f \n",(billf*0.05));
        System.out.println("--------------------");
        System.out.printf("Grand Total : %.2f\n",(billf+(billf*0.05)));
        System.out.println("--------------------");
        System.out.println("1.Confirm Order");
        System.out.println("2.Cancel Order");  
        int o = sc.nextInt();
        switch(o)
        {
            case 1:
            {
                System.out.println("Your Order has been placed and will be delivered in few mins");
            }
            case 2:
            {
              break;
            }
            default:
            {
               System.out.println("Invalid Selection");
               break;
            }
        }
        System.out.print(green);
        System.out.println("------THANK YOU VISIT AGAIN------");
        System.out.println("1.Place Another Order");
        System.out.println("2.Exit the App");
        int e = sc.nextInt();
        switch(e)
        {
          case 1:
           {
            System.out.print(def);
            bill = 0;
            new Main().main();
            break;
            }
           case 2:
           {
            System.out.print(def);
            System.exit(0);
           }
         }
    }
}
class Rest extends Main
{
    int c = 0;
    void menu()
    {   
        System.out.print(skblue);
        System.out.println("------WELCOME TO Restaurent SECTION------");
        System.out.println("Please Select a Place to order from");
        System.out.println("1.KANNA Restaurant - 1kms");
        System.out.println("2.BOSS Restaurant  - 2.5kms");
        System.out.println("3.Mini Restaurant  - 2kms");
        System.out.println("4.CV Restaurant    - 6kms");
        int n = sc.nextInt();
        switch(n)
        {
            case 1:
                {
                    Rest1();
                    if(bill!=0)
                    {
                        System.out.print(purpe);
                        bl1.billd(bill);
                    }
                    break;
                }
            case 2:
                {
                    Rest2();
                    if(bill!=0)
                    {
                      System.out.print(purpe);
                      bl1.billd(bill);
                    }
                    break;
                }
            case 3:
                {
                    Rest3();
                    if(bill!=0)
                    {
                       System.out.print(purpe);
                       bl1.billd(bill);
                    }
                    break;
                }
            case 4:
                {
                    Rest4();
                    if(bill!=0)
                    {
                      System.out.print(purpe);
                      bl1.billd(bill);
                    }
                    break;
                }
                default:
                {
                    System.out.print(red);
                    System.out.println("Invalid Selection, Please Select Again");
                    menu();
                }
        }
    }
    void Rest1()
    {
        c++;
        if(c==1)
        {
            System.out.print(skblue);
        System.out.println("------WELCOME TO KANNA Restaurant------");
        System.out.println("Please select Items of your Choice");
        }
        System.out.print(yellow);
        System.out.println("          ------Biryani's------           ");
        System.out.println("1. Chicken Biryani - Single      --> 249rs");
        System.out.println("2. Chicken Biryani - Family Pack --> 549rs");
        System.out.println("3. Chicken 65      - Single      --> 199rs");
        System.out.println("4. Mutton Biryani  - Single      --> 299rs");
        System.out.println("          ------DRINKS------              ");
        System.out.println("5. Thumbs Up       - 200ml       --> 20rs");
        System.out.println("6. Sprite          - 200ml       --> 20rs");
        System.out.println("7. Maaza           - 200ml       --> 20rs");
        System.out.println("8. Back");
        int n1 = sc.nextInt();
        switch(n1)
        {
            case 1:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*249;
                    break;
                }
            case 2:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*549;
                    break;
                }
            case 3:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*199;
                    break;
                }
            case 4:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*299;
                    break;
                }
            case 5:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*20;
                    break;
                }
            case 6:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*20;
                    break;
                }
            case 7:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*20;
                    break;
                }
            case 8:
                {
                    menu();
                    break;
                }
                default:
                {
                    System.out.print(red);
                     System.out.println("Invalid Selection, Please Select Again");
                     Rest1();
                }
        }
        System.out.print(green);
        System.out.println("1. Order More");
        System.out.println("2. Order From a Different Place");
        System.out.println("3. Confirm and Proceed");
        System.out.println("4. Cancel and Exit");
        int n2 = sc.nextInt();
        switch(n2)
        {
            case 1:
            {
                Rest1();
                break;
            }
            case 2:
            {
                new Bill().fbill(bill);
                break;
            }
            case 3:
            {
                break;
            }
            case 4:
            {
               bill = 0;
               break;
            }
        }
    }
    void Rest2()
    {
        c++;
        if(c==1)
        {
            System.out.print(skblue);
        System.out.println("------WELCOME TO BOSS Restaurant------");
        System.out.println("Please select Items of your Choice");
        }
        System.out.print(yellow);
        System.out.println("          ------MUTTON------             ");
        System.out.println("1. Mutton Biryani -  Single        --> 300rs");
        System.out.println("2. Mutton Biryani -  Family Pack   --> 649rs");
        System.out.println("3. Mutton Curry   -  1             --> 250rs");
        
        System.out.println("          ------CHICKEN------            ");
        System.out.println("4. Chicken Biryani - Single        --> 250rs");
        System.out.println("5. Chicken Biryani - Family Pack   --> 600rs");
        System.out.println("6. Drum Sticks     - 8 Pcs         --> 350rs");
        System.out.println("7. Chicken Curry   - 1             --> 200rs");
        System.out.println("          ------Staters------            ");
        System.out.println("8. Butter Naan      - 1             --> 45rs");
        System.out.println("9. Roti             - 1             --> 15rs");
        System.out.println("          ------DRINKS------                ");
        System.out.println("10. Sting           - 200ml         --> 20rs");
        System.out.println("11. Appy Fizz       - 200ml         --> 25rs");
        System.out.println("12. Redbull         - 450ml         --> 140rs");
        System.out.println("13. Back");
        int n1 = sc.nextInt();
        switch(n1)
        {
            case 1:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*300;
                    break;
                }
            case 2:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*649;
                    break;
                }
            case 3:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*250;
                    break;
                }
            case 4:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*250;
                    break;
                }
            case 5:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*600;
                    break;
                }
            case 6:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*350;
                    break;
                }
            case 7:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*200;
                    break;
                }
            case 8:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*45;
                    break;
                }
            case 9:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*15;
                    break;
                }
            case 10:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*20;
                    break;
                }
            case 11:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*25;
                    break;
                }
            case 12:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*140;
                    break;
                }
                case 13:
                {
                    menu();
                    break;
                }
                default:
                {
                    System.out.print(red);
                     System.out.println("Invalid Selection, Please Select Again");
                     Rest2();
                }
        }
        System.out.print(green);
        System.out.println("1. Order More");
        System.out.println("2. Order From a Different Place");
        System.out.println("3. Confirm and Proceed");
        System.out.println("4. Cancel and Exit");
        int n2 = sc.nextInt();
        switch(n2)
        {
            case 1:
            {
                Rest2();
                break;
            }
            case 2:
            {
                new Bill().fbill(bill);
                break;
            }
            case 3:
            {
                break;
            }
            case 4:
            {
               bill = 0;
               break;
            }
        }
    }
    void Rest3()
    {
        c++;
        if(c==1)
        {
            System.out.print(skblue);
        System.out.println("------WELCOME TO MINI RESTAURANT------");
        System.out.println("Please select Items of your Choice");
        }
        System.out.print(yellow);
        System.out.println("               ------VEG SECTION------              ");
        System.out.println("1. Meals                             - 1 Plate --> 300 rs");
        System.out.println("2. Mini Breakfast Combo              - 1 Plate --> 200 rs");
        System.out.println("3. Lemon Rice+Tomato Rice+Curd Rice  - 1 Plate --> 400rs");
        System.out.println("4. Veg Biryani+Tomato Rice+Curd Rice - 1 Plate --> 500rs");
        System.out.println("                 ------DRINKS------                 ");
        System.out.println("5. Thumbs Up                         - 200ml --> 20rs");
        System.out.println("6. Sprite                            - 200ml --> 20rs");
        System.out.println("7. Maaza                             - 200ml --> 20rs");
        System.out.println("8. Back");
        int n1 = sc.nextInt();
        switch(n1)
        {
            case 1:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*300;
                    break;
                }
            case 2:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*200;
                    break;
                }
            case 3:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*400;
                    break;
                }
            case 4:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*500;
                    break;
                }
            case 5:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*20;
                    break;
                }
            case 6:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*20;
                    break;
                }
            case 7:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*20;
                    break;
                }
                case 8:
                {
                    menu();
                    break;
                }
                default:
                {
                    System.out.print(red);
                     System.out.println("Invalid Selection, Please Select Again");
                     Rest3();
                }
        }
        System.out.print(green);
        System.out.println("1. Order More");
        System.out.println("2. Order From a Different Place");
        System.out.println("3. Confirm and Proceed");
        System.out.println("4. Cancel and Exit");
        int n2 = sc.nextInt();
        switch(n2)
        {
            case 1:
            {
                Rest3();
                break;
            }
            case 2:
            {
                new Bill().fbill(bill);
                break;
            }
            case 3:
            {
                break;
            }
            case 4:
            {
               bill = 0;
               break;
            }
        }
    }
    void Rest4()
    {
        c++;
        if(c==1)
        {
            System.out.print(skblue);
        System.out.println("------WELCOME TO CV RESTAURANT------");
        System.out.println("Please select Items of your Choice");
        }
        System.out.print(yellow);
        System.out.println("        ------MANDI SECTION------        ");
        System.out.println("1. Chicken Faham Mandi - Single --> 350rs");
        System.out.println("2. Chicken Faham Mandi - Full --> 800rs");
        System.out.println("3. Mutton Mandi        - Single --> 450");
        System.out.println("4. Mutton Mandi        - Full --> 1000");
        System.out.println("         ------Extra Items------          ");
        System.out.println("5. Double Ka Meetha    - 1 --> 50rs");
        System.out.println("6. Gullab Jamun        - 1 --> 50rs");
        System.out.println("7. Kaddu Ki Kheer      - 1 --> 70rs");
        System.out.println("8. Qubani Ka Meetha    - 1 --> 70rs");
        System.out.println("9. Mayonnaise          - 1 --> 70rs");
        System.out.println("           ------DRINKS------       ");
        System.out.println("10. Sting              - 200ml --> 20rs");
        System.out.println("11. Appy Fizz          - 200ml --> 25rs");
        System.out.println("12. Redbull            - 450ml --> 140rs");
        System.out.println("13. Back");
        int n1 = sc.nextInt();
        switch(n1)
        {
            case 1:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*350;
                    break;
                }
            case 2:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*800;
                    break;
                }
            case 3:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*450;
                    break;
                }
            case 4:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*1000;
                    break;
                }
            case 5:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*50;
                    break;
                }
            case 6:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*50;
                    break;
                }
            case 7:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*70;
                    break;
                }
            case 8:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*70;
                    break;
                }
            case 9:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*70;
                    break;
                }
            case 10:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*20;
                    break;
                }
            case 11:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*25;
                    break;
                }
            case 12:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*140;
                    break;
                }
                case 13:
                {
                    menu();
                    break;
                }
                default:
                {
                    System.out.print(red);
                     System.out.println("Invalid Selection, Please Select Again");
                     Rest4();
                }
        }
        System.out.print(green);
        System.out.println("1. Order More");
        System.out.println("2. Order From a Different Place");
        System.out.println("3. Confirm and Proceed");
        System.out.println("4. Cancel and Exit");
        int n2 = sc.nextInt();
        switch(n2)
        {
            case 1:
            {
                Rest4();
                break;
            }
            case 2:
            {
                new Bill().fbill(bill);
                break;
            }
            case 3:
            {
                break;
            }
            case 4:
            {
               bill = 0;
               break;
            }
        }
    }
}
class Bakery extends Main
{
    int c = 0;
    void bakelist()
    {
        System.out.print(def);
        System.out.println("------WELCOME TO BAKERY SECTION------");
        System.out.println("Please Select a Place to order from");
        System.out.println("1.Alankar Bakery - 2kms");
        System.out.println("2.CV Bakers - 6kms");
        int n = sc.nextInt();
        switch(n)
        {
            case 1:
                {
                    bake1();
                    if(bill!=0)
                    {
                      System.out.print(purpe);
                      bl1.billd(bill);
                    }
                    break;
                }
            case 2:
                {
                    bake2();
                    if(bill!=0)
                    {
                     System.out.print(purpe);
                     bl1.billd(bill);
                    }
                    break;
                }
                default:
                {
                    System.out.println("Invalid Selection, Please Select Again");
                    bakelist();
                }
        }
    }
    void bake1()
    {
        c++;
        if(c==1)
        {
            System.out.print(skblue);
        System.out.println("------WELCOME TO ALANKAR BAKERY------");
        System.out.println("Please select Items of your Choice");
        }
        System.out.print(yellow);
        System.out.println("     ------CAKES SECTION------      ");
        System.out.println("1. Black Forest    - 500g --> 700rs");
        System.out.println("2. Strawberry Cake - 500g --> 450rs");
        System.out.println("3. Chocolate Cake  - 500g --> 400rs");
        System.out.println("4. Vanilla Cake    - 500g --> 500rs");
        System.out.println("          ------DRINKS------          ");
        System.out.println("5. Thumbs Up       - 200ml --> 20rs");
        System.out.println("6. Sprite          - 200ml --> 20rs");
        System.out.println("7. Maaza           - 200ml --> 20rs");
        System.out.println("8. Back");
        int n1 = sc.nextInt();
        switch(n1)
        {
            case 1:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*700;
                    break;
                }
            case 2:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*450;
                    break;
                }
            case 3:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*400;
                    break;
                }
            case 4:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*500;
                    break;
                }
            case 5:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*20;
                    break;
                }
            case 6:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*20;
                    break;
                }
            case 7:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*20;
                    break;
                }
            case 8:
                {
                    bakelist();
                    break;
                }
                default:
            {
                System.out.print(red);
                System.out.println("Invalid Selection, Please Select again");
                bake1();
            }
        }
        System.out.print(green);
        System.out.println("1. Order More");
        System.out.println("2. Order From a different place");
        System.out.println("3. Confirm and Proceed");
        System.out.println("4. Cancel and Exit");
        int n2 = sc.nextInt();
        switch(n2)
        {
            case 1:
            {
                bake1();
                break;
            }
            case 2:
            {
                new Bill().fbill(bill);
                break;
            }
            case 3:
            {
                break;
            }
            case 4:
            {
               bill = 0;
               break;
            }
        }
    }
    void bake2()
    {
        c++;
        if(c==1)
        {
            System.out.print(skblue);
        System.out.println("------WELCOME TO CV BAKERS------");
        System.out.println("Please select Items of your Choice");
        }
        System.out.print(yellow);
        System.out.println("     ------PASTRIES SECTION------");
        System.out.println("1. Pinapple Pastry     - 1Pc --> 25rs");
        System.out.println("2. Mango Pastry        - 1Pc --> 20rs");
        System.out.println("3. Chocolate Pastry    - 1Pc --> 40rs");
        System.out.println("4. Butterscotch Pastry - 1Pc --> 45rs");
        System.out.println("        ------ICECREAMS------");
        System.out.println("5. Chocobar            - 1 --> 30rs");
        System.out.println("6. Pullice             - 1 --> 5rs");
        System.out.println("7. Cornetto            - 1 --> 40rs");
        System.out.println("8. Kulfi               - 1 --> 25rs");
        System.out.println("9. Family Pack         - 1 --> 150rs");
        System.out.println("          ------DRINKS------");
        System.out.println("10. Sting              - 200ml --> 20rs");
        System.out.println("11. Appy Fizz          - 200ml --> 25rs");
        System.out.println("12. Redbull            - 450ml --> 140rs");
        System.out.println("13. Back");
        int n1 = sc.nextInt();
        switch(n1)
        {
            case 1:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*25;
                    break;
                }
            case 2:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*20;
                    break;
                }
            case 3:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*40;
                    break;
                }
            case 4:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*45;
                    break;
                }
            case 5:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*30;
                    break;
                }
            case 6:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*5;
                    break;
                }
            case 7:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*40;
                    break;
                }
            case 8:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*25;
                    break;
                }
            case 9:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*150;
                    break;
                }
            case 10:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*20;
                    break;
                }
            case 11:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*25;
                    break;
                }
            case 12:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*140;
                    break;
                }
            case 13:
                {
                    bakelist();
                    break;
                }
                default:
            {
                System.out.print(red);
                System.out.println("Invalid Selection, Please Select again");
                bake2();
            }
        }
        System.out.print(green);
        System.out.println("1. Order More");
        System.out.println("2. Order from a Different place");
        System.out.println("3. Confirm and Proceed");
        System.out.println("4. Cancel and Exit");
        int n2 = sc.nextInt();
        switch(n2)
        {
            case 1:
            {
                bake2();
                break;
            }
            case 2:
            {
                new Bill().fbill(bill);
                break;
            }
            case 3:
            {
                break;
            }
            case 4:
            {
               bill = 0;
               break;
            }
        }
    }
}
class Milkshake extends Main
{
    int c = 0;
    void milklist()
    {
        System.out.print(def);
        System.out.println("------WELCOME TO MILKSHAKES------");
        System.out.println("Please Select a Place to order from");
        System.out.println("1. Makers of Milkshake - 2kms");
        System.out.println("2. Lassi shop - 5kms");
        int n = sc.nextInt();
        switch(n)
        {
            case 1:
                {
                    shake1();
                    if(bill!=0)
                    {
                        System.out.print(purpe);
                    bl1.billd(bill);
                    }
                    break;
                }
            case 2:
                {
                    shake2();
                    if(bill!=0)
                    {
                        System.out.print(purpe);
                    bl1.billd(bill);
                    }
                    break;
                }
                default:
                {
                    System.out.print(red);
                    System.out.println("Invalid Selection, Please Select Again");
                    milklist();
                }
        }
    }
    void shake1()
    {
        c++;
        if(c==1)
        {
            System.out.print(skblue);
        System.out.println("------WELCOME TO Makers of Milkshake------");
        System.out.println("Please select Items of your Choice");
        }
        System.out.print(yellow);
        System.out.println("     ------MILKSHAKES SECTION------");
        System.out.println("1. Vanilla Milkshake - 200ml --> 60 rs");
        System.out.println("2. Strawberry Milkshake - 200ml --> 60rs");
        System.out.println("3. Chocolate Milkshake - 200ml --> 70rs");
        System.out.println("4. Kitkat Milkshake - 200ml --> 80rs");
        System.out.println("        ------SALADS SECTION------");
        System.out.println("5. Dry fuit Salad --> 100rs");
        System.out.println("6. Mixed fruit Salad - 200ml --> 80rs");
        System.out.println("7. Back");
        int n1 = sc.nextInt();
        switch(n1)
        {
            case 1:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*60;
                    break;
                }
            case 2:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*60;
                    break;
                }
            case 3:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*70;
                    break;
                }
            case 4:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*80;
                    break;
                }
            case 5:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*100;
                    break;
                }
            case 6:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*80;
                    break;
                }
            case 7:
                {
                    milklist();
                    break;
                }
                    default:
            {
                System.out.print(red);
                System.out.println("Invalid Selection, Please Select again");
                shake1();
            }
        }
        System.out.print(green);
        System.out.println("1. Order More");
        System.out.println("2. Order From a different place");
        System.out.println("3. Confirm and Proceed");
        System.out.println("4. Cancel and Exit");
        int n2 = sc.nextInt();
        switch(n2)
        {
            case 1:
            {
                shake1();
                break;
            }
            case 2:
            {
                new Bill().fbill(bill);
                break;
            }
            case 3:
            {
                break;
            }
            case 4:
            {
               bill = 0;
               break;
            }
        }
    }
    void shake2()
    {
        c++;
        if(c==1)
        {
            System.out.print(skblue);
        System.out.println("------WELCOME TO LASSI SHOP------");
        System.out.println("Please select Items of your Choice");
        }
        System.out.print(yellow);
        System.out.println("    ------LASSI SECTION------");
        System.out.println("1.  Thick  Lassi - 1      --> 60rs");
        System.out.println("2.  Special Lassi - 1     --> 90rs");
        System.out.println("3.  Dry fruit Lassi- 1    --> 100rs");
        System.out.println("4.  Banana Lassi - 1      --> 70rs");
        System.out.println("       ------Falooda------");
        System.out.println("5.  Kesar Falooda - 1     --> 80rs");
        System.out.println("6.  Speacial Falooda-1    --> 120rs");
        System.out.println("7.  Kulfi Falooda - 1     --> 90rs");
        System.out.println("      ------MOCKTAILS------");
        System.out.println("8.  Blueberry Smoothie    --> 120rs");
        System.out.println("9.  Strawberry Smoothie   --> 80rs");
        System.out.println("10. Mango Smoothie       ---> 90rs");
        System.out.println("11. Back");
        int n1 = sc.nextInt();
        switch(n1)
        {
            case 1:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*60;
                    break;
                }
            case 2:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*90;
                    break;
                }
            case 3:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*100;
                    break;
                }
            case 4:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*70;
                    break;
                }
            case 5:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*80;
                    break;
                }
            case 6:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*120;
                    break;
                }
            case 7:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*90;
                    break;
                }
            case 8:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*120;
                    break;
                }
            case 9:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*80;
                    break;
                }
            case 10:
                {
                    System.out.print("Quantity: ");
                    int c1 = sc.nextInt();
                    bill = bill + c1*90;
                    break;
                }
            case 11:
                {
                    milklist();
                    break;
                }
                    default:
            {
                System.out.print(red);
                System.out.println("Invalid Selection, Please Select again");
                shake2();
            }
                
        }
        System.out.print(green);
        System.out.println("1. Order More");
        System.out.println("2. Order From a different place");
        System.out.println("3. Confirm and Proceed");
        System.out.println("4. Cancel and Exit");
        int n2 = sc.nextInt();
        switch(n2)
        {
            case 1:
            {
                shake2();
                break;
            }
            case 2:
            {
                new Bill().fbill(bill);
                break;
            }
            case 3:
            {
                break;
            }
            case 4:
            {
               bill = 0;
               break;
            }
        }   
    }
}
class juice extends Main
{
    int c = 0;
    void fruit()
    {
        System.out.print(skblue);
        System.out.println("------WELCOME TO FRUIT JUICE CORNER------");
        fj();
        if(bill!=0)
        {
            System.out.print(purpe);
            bl1.billd(bill);
        }
    }
    void fj()
    {
        System.out.print(yellow);
        System.out.println(" Please select item ");
        System.out.println("1.Banana     --> 30rs");
        System.out.println("2.Grape      --> 30rs");
        System.out.println("3.Mango      --> 40rs");
        System.out.println("4.PineApple  --> 30rs");
        System.out.println("5.Sapota     --> 40rs");
        System.out.println("6.Lassi      --> 20rs");
        System.out.println("7.Apple      --> 50rs");
        System.out.println("8.Dry fruit  --> 80rs");
        int n1=sc.nextInt();
        switch(n1)
        {
            case 1:
                {
                    System.out.print("Quantity:");
                     int c1=sc.nextInt();
                     bill=bill+c1*30;
                     break;
                }
            case 2:
                {
                    System.out.print("Quantity:");
                     int c1=sc.nextInt();
                     bill=bill+c1*30;
                     break;
                }
            case 3:
                {
                    System.out.print("Quantity:");
                     int c1=sc.nextInt();
                     bill=bill+c1*40;
                     break;
                }
            case 4:
                {
                    System.out.print("Quantity:");
                     int c1=sc.nextInt();
                     bill=bill+c1*30;
                     break;
                }
            case 5:
                {
                    System.out.print("Quantity:");
                     int c1=sc.nextInt();
                     bill=bill+c1*40;
                     break;
                }
            case 6:
                {
                    System.out.print("Quantity:");
                     int c1=sc.nextInt();
                     bill=bill+c1*20;
                     break;
                }
            case 7:
                {
                    System.out.print("Quantity:");
                     int c1=sc.nextInt();
                     bill=bill+c1*50;
                     break;
                }
            case 8:
                {
                    System.out.print("Quantity:");
                     int c1=sc.nextInt();
                     bill=bill+c1*80;
                     break;
                }
                default:
            {
                System.out.print(red);
                System.out.println("Invalid Selection, Please Select again");
                fj();
            }
        }
        System.out.print(green);
        System.out.println("1.Order More");
        System.out.println("2.Order From a Different Place");
        System.out.println("3.Confirm and proceed");
        System.out.println("4.Cancel and Exit");
        int n2=sc.nextInt();
        switch(n2)
        {
                case 1:
                {
                    fj();
                    break;
                }
                case 2:
                {
                    new Bill().fbill(bill);
                    break;
                }
                case 3:
                {
                    break;
                }
                case 4:
                {
                    bill = 0;
                    break;
                }
        }
    }
}