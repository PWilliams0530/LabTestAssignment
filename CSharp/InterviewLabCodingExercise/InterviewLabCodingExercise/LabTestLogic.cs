using System;
using System.Collections.Generic;
using System.Text;
using System.Linq;

namespace InterviewLabCodingExercise
{
    public class LabTestLogic
    {
        public Dictionary<string,int> AboveBelow(List<int> unsortedList, int comparisonValue)
        {
            if (unsortedList == null || comparisonValue < 0)
            {
                throw new Exception("Invalid Parameters");
            }

            return new Dictionary<string, int>()
            {
                {"Above", unsortedList.Where(x => x > comparisonValue).Count() },
                {"Below",  unsortedList.Where(x => x < comparisonValue).Count() }
            };
        }

        public string Rotator(string initial, int inputRotation)
        {
            if (inputRotation < 0 || inputRotation > int.MaxValue)
            {
                throw new Exception("Invalid Rotation Amount");
            }

            while (inputRotation > initial.Length)
            {
                inputRotation -= initial.Length;
            }

            return string.Format("{0}{1}", initial.Substring(initial.Length - inputRotation), initial.Substring(0, (initial.Length - inputRotation)));
        }
    }
}
