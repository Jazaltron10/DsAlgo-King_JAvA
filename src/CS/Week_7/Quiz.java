

public class Quiz {
        public static void main(String[] args) {

                Question question_1 = new MultipleChoiceQuestion(
                                "Q1. Three people have won the World Cup as a player and as a coach. Mario Zagallo, Didier Deschamps an.. can you name the third?",
                                " Vicente Del Bosque", " Duda", " Joachim Low", " Roberto Mancini", "Franz Beckenbauer",
                                "e");
                question_1.check();

                Question question_2 = new MultipleChoiceQuestion(
                                "Q2. Messi famously retired from international duty in which year before reversing his decision?",
                                " 2014", " 2015", " 2016", " 2017", "2019", "c");
                question_2.check();

                Question question_3 = new MultipleChoiceQuestion(
                                "Q3. Who Scored FC Barcelona's First Goal at the 2015 UCL Final?", " Luiz Suarez",
                                " Neymar", " Jordi Alba", " Ivan Rakitic", "Andres Iniesta", "d");
                question_3.check();

                Question question_4 = new MultipleChoiceQuestion("Q4. Who Won the 1996 European Championship", "Italy",
                                "Portugal", "France", "Germany", "Spain", "d");
                question_4.check();

                Question question_5 = new MultipleChoiceQuestion(
                                "Q5. Which player holds the record for most Champions League winners medals?", " Raul",
                                " Gento", " Di Stefano", " Puskas", "Miereles", "b");
                question_5.check();

                Question question_6 = new MultipleChoiceQuestion(
                                "Q6. There have been two World Cup trophies. What was the name of the first?",
                                " Delphine Romero Trophy", " Jules Rimet Trophy", " Aurier Louis Trophy",
                                " Dino Melaye Trophy", "Olivier Anais Corentin Trophy", "b");
                question_6.check();

                Question question_7 = new MultipleChoiceQuestion("Q7. Who won the Second World Cup Hosted in 1934?",
                                " Uruguay", " Italy", " Brazil", " West Germany", "Argentina", "b");
                question_7.check();

                Question question_8 = new TrueFalseQuestion("Q8. Argentina won their very First FIFA World Cup in 1978",
                                "True");
                question_8.check();

                Question question_9 = new TrueFalseQuestion("Q9. The record number of World Cup goals is 19", "False");
                question_9.check();

                Question question_10 = new TrueFalseQuestion(
                                "Q10. Three people have won the World Cup as a player and as a coach", "true");
                question_10.check();

                Question question_11 = new TrueFalseQuestion("Q11. Italy Defeated England to win the 2020 European cup",
                                "true");
                question_11.check();

                Question question_12 = new TrueFalseQuestion(
                                "Q12. Jadon Sancho Was A Product Of FCBarcelona Football Academy", "false");
                question_12.check();

                Question question_13 = new TrueFalseQuestion(
                                "Q13. As of 2021 Gerd Muller's record goals of 40 still stands in the Bundesliga",
                                "false");
                question_13.check();

                Question question_14 = new TrueFalseQuestion("Q14. Cristiano Ronaldo Played For Manchester United",
                                "true");
                question_14.check();
                Question question_15 = new TrueFalseQuestion("Q14. Cristiano Ronaldo is the alltime goalscorer for the portugal national team",
                                "true");
                question_15.check();

                MultipleChoiceQuestion.showResults();
        }
}