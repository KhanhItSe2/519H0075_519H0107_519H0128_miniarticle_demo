using System;

namespace StatePattern
{
    public interface ATMState
    {
        void Insert();
        void Eject();
        void EnterPin();
        void Withdraw();
    }
}
