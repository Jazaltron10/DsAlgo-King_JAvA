package CS;

public class Quiz_3 {
        public static void main(String[] args) {

                MultipleChoiceQuestion question_1 = new MultipleChoiceQuestion(
                                "Q1. Which of these players below played in THREE consecutive Fifa world Cup Finals, Winning two Back to Back",
                                "Rivaldo", "Pele", "Cafu", "Bebeto", "Romario", "b");
                question_1.check();

                MultipleChoiceQuestion question_2 = new MultipleChoiceQuestion(
                                "Q2. How many goals has Neymar scored for brazil", "74", "70", "68", "67", "65", "c");
                question_2.check();

                MultipleChoiceQuestion question_3 = new MultipleChoiceQuestion(
                                "Q3. As of 2021 How many UEFA Champions League trophies has AC Milan won", "2", "6",
                                "5", "4", "7", "e");
                question_3.check();

                MultipleChoiceQuestion question_4 = new MultipleChoiceQuestion(
                                "Q4. Who Won the 1996 European Championship", "Italy", "Portugal", "France", "Germany",
                                "Spain", "d");
                question_4.check();

                MultipleChoiceQuestion question_5 = new MultipleChoiceQuestion(
                                "Q5. Who is the greatest footballer of all time", "Messi", "Maradona", "Pele", "Zidane",
                                "Ronaldo", "c");
                question_5.check();

                MultipleChoiceQuestion question_6 = new MultipleChoiceQuestion(
                                "Q6. There have been two World Cup trophies. What was the name of the first?",
                                " Delphine Romero Trophy", " Jules Rimet Trophy", " Aurier Louis Trophy",
                                " Dino Melaye Trophy", "Olivier Anais Corentin Trophy", "b");
                question_6.check();

                MultipleChoiceQuestion question_7 = new MultipleChoiceQuestion(
                                "Q7. Who won the Second World Cup Hosted in 1934?", " Uruguay", " Italy", " Brazil",
                                " West Germany", "Argentina", "b");
                question_7.check();

                MultipleChoiceQuestion question_8 = new MultipleChoiceQuestion(
                                "Q8. In what year did Argentina win their very First FIFA World Cup", " 1974", " 1978",
                                " 1982", " 1986", "1990", "b");
                question_8.check();

                MultipleChoiceQuestion question_9 = new MultipleChoiceQuestion(
                                "Q9. The record number of World Cup goals is 16, scored by who?", " Ronaldo Delima",
                                " Pele", " Klose", " Gerd Muller", "Platini", "c");
                question_9.check();

                MultipleChoiceQuestion question_10 = new MultipleChoiceQuestion(
                                "Q10. Three people have won the World Cup as a player and as a coach. Mario Zagallo, Didier Deschamps an.. can you name the third?",
                                " Vicente Del Bosque", " Duda", " Joachim Low", " Roberto Mancini", "Franz Beckenbauer",
                                "e");
                question_10.check();

                MultipleChoiceQuestion question_11 = new MultipleChoiceQuestion(
                                "Q11. Messi famously retired from international duty in which year before reversing his decision?",
                                " 2014", " 2015", " 2016", " 2017", "2019", "c");
                question_11.check();

                MultipleChoiceQuestion question_12 = new MultipleChoiceQuestion(
                                "Q12. Which player holds the record for most Champions League winners medals?", " Raul",
                                " Gento", " Di Stefano", " Puskas", "Miereles", "b");
                question_12.check();

                MultipleChoiceQuestion question_13 = new MultipleChoiceQuestion(
                                "Q13. Which outfield player appeared in the Champions League final in three different decades?",
                                " Ryan Giggs", " Phillip Lahm", " Oliver Kahn", " Cafu", "Paolo Maldini", "a");
                question_13.check();

                MultipleChoiceQuestion question_14 = new MultipleChoiceQuestion(
                                "Q14. Who Scored FC Barcelona's First Goal at the 2015 UCL Final?", " Luiz Suarez",
                                " Neymar", " Jordi Alba", " Ivan Rakitic", "Andres Iniesta", "d");
                question_14.check();

                MultipleChoiceQuestion question_15 = new MultipleChoiceQuestion(
                                "Q15. How many La Liga titles have Real Madrid won as of 2021?", " 33", " 34", " 35",
                                " 36", "32", "b");
                question_15.check();

                MultipleChoiceQuestion question_16 = new MultipleChoiceQuestion("Q16. Who won the 2018 FIFA World Cup",
                                "France", "Spain", "Germany", "Brazil", "Croatia", "a");
                question_16.check();

                MultipleChoiceQuestion question_17 = new MultipleChoiceQuestion("Q17. Who won the 2016 Euro Cup",
                                "Germany", "Spain", "Portugal", "France", "Italy", "c");
                question_17.check();

                MultipleChoiceQuestion question_18 = new MultipleChoiceQuestion("Q18. Who won the 2014 FIFA World Cup",
                                "Italy", "Spain", "Argentina", "France", "Germany", "e");
                question_18.check();

                MultipleChoiceQuestion question_19 = new MultipleChoiceQuestion(
                                "Q19. Who won the 2017 UEFA Champions League", "Barcelona", "Arsenal", "Norwich",
                                "Real Madrid", "Chelsea", "d");
                question_19.check();

                MultipleChoiceQuestion question_170 = new MultipleChoiceQuestion(
                                "Q20. Who won the 2020 English Premier League", "Arsenal", "Liverpool",
                                "Leicester City", "Manchester City", "Chelsea", "b");
                question_170.check();

                MultipleChoiceQuestion.showResults();

        }
}