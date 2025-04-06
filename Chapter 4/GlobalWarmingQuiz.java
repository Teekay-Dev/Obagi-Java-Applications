import java.util.Scanner;

public class GlobalWarmingQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = 0;

        String[] questions = {
            "What is the primary cause of global warming?",
            "Which of the following is a common argument made by global warming skeptics?",
            "What is one major consequence of global warming?",
            "Which organization is responsible for assessing climate change research globally?",
            "What is a proposed solution to mitigate global warming?"
        };

        String[][] options = {
            {"1. Natural climate cycles", "2. Increased solar activity", "3. Human-generated greenhouse gases", "4. Volcanic eruptions"},
            {"1. Climate change is entirely caused by human activity", "2. The Earth’s climate has always changed naturally", "3. Renewable energy is the only solution to climate change", "4. Global warming is accelerating faster than predicted"},
            {"1. Decreased ocean temperatures", "2. Increased frequency of extreme weather events", "3. Reduced carbon dioxide levels in the atmosphere", "4. Expansion of polar ice caps"},
            {"1. NASA", "2. The Intergovernmental Panel on Climate Change (IPCC)", "3. The World Health Organization (WHO)", "4. The United Nations Security Council"},
            {"1. Increasing fossil fuel consumption", "2. Reducing greenhouse gas emissions", "3. Eliminating all industrial activity", "4. Stopping all agricultural production"}
        };

        int[] correctAnswers = {3, 2, 2, 2, 2};

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.print("Enter your answer (1-4): ");
            int answer = input.nextInt();
            if (answer == correctAnswers[i]) {
                score++;
            }
        }

        System.out.println("\nYour score: " + score + "/5");

        if (score == 5) {
            System.out.println("Excellent!");
        } else if (score == 4) {
            System.out.println("Very good!");
        } else {
            System.out.println("Time to brush up on your knowledge of global warming.");
            System.out.println("Here are some sources to learn more:");
            System.out.println("[Britannica](https://www.britannica.com/science/global-warming)");
            System.out.println("[GlobalGiving](https://www.globalgiving.org/learn/climate-change-facts)");
            System.out.println("[NRDC](https://www.nrdc.org/stories/global-warming-101)");
        }

        input.close();
    }
}
Ex.4.30