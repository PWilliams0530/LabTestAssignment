using System;
using System.Collections.Generic;
using System.Text;
using NUnit;
using NUnit.Framework;

namespace InterviewLabCodingExercise.Tests
{
    [TestFixture]
    public class LabTestLogicTests
    {
        LabTestLogic logic = new LabTestLogic();

        [TestCase("MyString", 2, "ngMyStri")]
        [TestCase("IronMan", 4, "nManIro")]
        [TestCase("ZeroSum", 0, "ZeroSum")]
        [TestCase("SonicAndTails", 13, "SonicAndTails")]
        [TestCase("DoubleRotation", 14, "DoubleRotation")]
        [TestCase("TwoAndAHalf!", 30, "AHalf!TwoAnd" )]
        [TestCase("", 0, "")]
        public void ROTATOR_VALIDTESTS(string initialString, int RotationNumber, string expectedResult)
        {
            string actualResult = logic.Rotator(initialString, RotationNumber);
            Assert.AreEqual(expectedResult, actualResult);
        }

        [TestCase("SubZeroWins", -5)]
        public void ROTATOR_INVALID_LENGTH_THROWS_EXCEPTION(string initialString, int RotationNumber)
        {
            try
            {
                logic.Rotator(initialString, RotationNumber);
                Assert.Fail();
            }
            catch (Exception)
            {
                Assert.Pass();
            }
        }

        [TestCase(7, 5, 6)]
        [TestCase(17, 1, 9)]
        [TestCase(0, 11, 0)]
        [TestCase(50, 0, 11)]
        public void ABOVEBELOW_VALIDTESTS(int targetNumber, int expectedAbove, int expectedBelow)
        {
            List<int> unsortedList = new List<int>() { 1, 5, 9, 3, 2, 17, 22, 5, 11, 6, 8 };
            Dictionary<string, int> result = logic.AboveBelow(unsortedList, targetNumber);
            Assert.True(result.Count == 2);
            Assert.True(result["Above"] == expectedAbove);
            Assert.True(result["Below"] == expectedBelow);
        }

        [TestCase(6, 0, 0)]
        public void ABOVEBELOW_EMPTYLIST(int targetNumber, int expectedAbove, int expectedBelow)
        {
            List<int> unsortedList = new List<int>() {};
            Dictionary<string, int> result = logic.AboveBelow(unsortedList, targetNumber);
            Assert.True(result.Count == 2);
            Assert.True(result["Above"] == expectedAbove);
            Assert.True(result["Below"] == expectedBelow);
        }

        [Test]
        public void ABOVEBELOW_NULL_LIST_THROWS_EXCEPTION()
        {
            try
            {
                logic.AboveBelow(null, 5);
                Assert.Fail();
            }
            catch (Exception ex)
            {
                Assert.Pass();
            }
        }

        [Test]
        public void ABOVEBELOW_NEGATIVE_NUMBER_THROWS_EXCEPTION()
        {
            try
            {
                logic.AboveBelow(new List<int>(), -5);
                Assert.Fail();
            }
            catch (Exception)
            {
                Assert.Pass();
            }
        }
    }
}
