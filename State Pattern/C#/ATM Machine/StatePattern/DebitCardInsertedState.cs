using System;
namespace StatePattern
{
    public class DebitCardInsertedState : ATMState
    {
        public void Insert()
        {
            Console.WriteLine("Ban khong the dua the vao, vi may da co the ATM!");
        }

        public void Eject()
        {
            Console.WriteLine("The da duoc lay ra");
        }

        public void EnterPin()
        {
            Console.WriteLine("Ma Pin chinh xac");
        }

        public void Withdraw()
        {
            Console.WriteLine("Tien da duoc rut");
        }
    }
}


