public class QuizWeekFive {
        public static void main(String[] args) {

                QuestionWeekFive question_1 = new MultipleChoiceQuestionWeekFive(
                                "Q1. Three people have won the World Cup as a player and as a coach. Mario Zagallo, Didier Deschamps an.. can you name the third?",
                                " Vicente Del Bosque", " Duda", " Joachim Low", " Roberto Mancini", "Franz Beckenbauer",
                                "e");
                question_1.check();

                QuestionWeekFive question_2 = new MultipleChoiceQuestionWeekFive(
                                "Q2. Messi famously retired from international duty in which year before reversing his decision?",
                                " 2014", " 2015", " 2016", " 2017", "2019", "c");
                question_2.check();

                QuestionWeekFive question_3 = new MultipleChoiceQuestionWeekFive(
                                "Q3. Who Scored FC Barcelona's First Goal at the 2015 UCL Final?", " Luiz Suarez",
                                " Neymar", " Jordi Alba", " Ivan Rakitic", "Andres Iniesta", "d");
                question_3.check();

                QuestionWeekFive question_4 = new MultipleChoiceQuestionWeekFive("Q4. Who Won the 1996 European Championship", "Italy",
                                "Portugal", "France", "Germany", "Spain", "d");
                question_4.check();

                QuestionWeekFive question_5 = new MultipleChoiceQuestionWeekFive(
                                "Q5. Which player holds the record for most Champions League winners medals?", " Raul",
                                " Gento", " Di Stefano", " Puskas", "Miereles", "b");
                question_5.check();

                QuestionWeekFive question_6 = new MultipleChoiceQuestionWeekFive(
                                "Q6. There have been two World Cup trophies. What was the name of the first?",
                                " Delphine Romero Trophy", " Jules Rimet Trophy", " Aurier Louis Trophy",
                                " Dino Melaye Trophy", "Olivier Anais Corentin Trophy", "b");
                question_6.check();

                QuestionWeekFive question_7 = new MultipleChoiceQuestionWeekFive("Q7. Who won the Second World Cup Hosted in 1934?",
                                " Uruguay", " Italy", " Brazil", " West Germany", "Argentina", "b");
                question_7.check();

                QuestionWeekFive question_8 = new TrueFalseQuestionWeekFive("Q8. Argentina won their very First FIFA World Cup in 1978",
                                "True");
                question_8.check();

                QuestionWeekFive question_9 = new TrueFalseQuestionWeekFive("Q9. The record number of World Cup goals is 19", "False");
                question_9.check();

                QuestionWeekFive question_10 = new TrueFalseQuestionWeekFive(
                                "Q10. Three people have won the World Cup as a player and as a coach", "true");
                question_10.check();

                QuestionWeekFive question_11 = new TrueFalseQuestionWeekFive("Q11. Italy Defeated England to win the 2020 European cup",
                                "true");
                question_11.check();

                QuestionWeekFive question_12 = new TrueFalseQuestionWeekFive(
                                "Q12. Jadon Sancho Was A Product Of FCBarcelona Football Academy", "false");
                question_12.check();

                QuestionWeekFive question_13 = new TrueFalseQuestionWeekFive(
                                "Q13. As of 2021 Gerd Muller's record goals of 40 still stands in the Bundesliga",
                                "false");
                question_13.check();

                QuestionWeekFive question_14 = new TrueFalseQuestionWeekFive("Q14. Cristiano Ronaldo Played For Manchester United",
                                "true");
                question_14.check();

                MultipleChoiceQuestionWeekFive.showResults();

        }

}