using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StatePattern
{
    internal class Program
    {
        static void Main(string[] args)
        {
            
            ATMMachine machine = new ATMMachine();
            Console.WriteLine("Tinh trang may hien tai: "
                            + machine.state.GetType().Name);
            machine.EnterPin();
            machine.Withdraw();
            machine.Eject();
            machine.Insert();
            Console.WriteLine();
        
            Console.WriteLine("Tinh trang may hien tai: "
                            + machine.state.GetType().Name);
            machine.EnterPin();
            machine.Withdraw();
            machine.Insert();
            machine.Eject();
            Console.WriteLine("");
         
            Console.WriteLine("Tinh trang may hien tai: "
                            + machine.state.GetType().Name);
            Console.Read();
        }
    }
}
