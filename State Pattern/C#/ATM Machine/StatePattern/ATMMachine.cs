using System;
namespace StatePattern
{
    public class ATMMachine : ATMState
    {
        public ATMState state { get; set; }

        public ATMMachine()
        {
            state = new DebitCardNotInsertedState();
        }

        public void Insert()
        {
            state.Insert();


            if (state is DebitCardNotInsertedState)
            {
                state = new DebitCardInsertedState();

                Console.WriteLine("May da nhan the ");
            }
        }

        public void Eject()
        {
            state.Eject();

            if (state is DebitCardInsertedState)
            {

                state = new DebitCardNotInsertedState();
                Console.WriteLine("May da tra the ");
            }
        }

        public void EnterPin()
        {
            state.EnterPin();
        }
        public void Withdraw()
        {
            state.Withdraw();
        }
    }
}