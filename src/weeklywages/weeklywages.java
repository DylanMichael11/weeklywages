package weeklywages;

public class weeklywages { 
    public static void main(String[] args) {
        // Check if an input was entered									
        if (args.length == 0) {
            System.out.println("Please provide the weekly income.");
            return;  // Exit the program if no income is provided
        }

        // Convert the input argument from String to double for numbers
        double income = Double.parseDouble(args[0]);

        // Initialize the tax var		
        double taxWithholding = 0;

        // Calculate tax withholding based on income brackets
        if (income < 500) {
            // 10% tax rate for income less than $500
            taxWithholding = income * 0.10;
        } else if (income < 1500) {
            // 15% tax rate for income between $500 and $1499.99
            taxWithholding = income * 0.15;
        } else if (income < 2500) {
            // 20% tax rate for income between $1500 and $2499.99
            taxWithholding = income * 0.20;
        } else {
            // 30% tax rate for income $2500 and above
            taxWithholding = income * 0.30;
        }

        // Calculate net income after tax withholding
        double netIncome = income - taxWithholding;

        // print the results
        System.out.println("Weekly Income: $" + income);
        System.out.println("Tax Withholding: $" + taxWithholding);
        System.out.println("Net Income: $" + netIncome);
    }
}
