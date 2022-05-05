using System;
namespace StatePattern
{
    public class DebitCardNotInsertedState : ATMState
    {
        public void Insert()
        {
            Console.WriteLine("The ATM da duoc dua vao");
        }

        public void Eject()
        {
            Console.WriteLine("Ban khong the rut the, vi may chua co the ATM!");
        }

        public void EnterPin()
        {
            Console.WriteLine("Ban khong the nhap ma Pin, vi may chua co the ATM!");
        }

        public void Withdraw()
        {
            Console.WriteLine("Ban khong the rut tien, vi may chua co the ATM!");
        }
    }
}

