package com.corejava.casestudy;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class BankClient {

	public static void main(String[] args) {
		HashMap<Long, Account> accounts = new HashMap<Long, Account>();
		HashMap<Transaction,Long> transactions = new HashMap<Transaction,Long>();
		long accNo;
		String accHolderName;
		String typeOfAccount;
		float accBalance = 2000;
		String address;
		long contactNo;
		Account account;
		boolean value = true;
		while (value) {
			Scanner scan = new Scanner(System.in);
			System.out.println("****************BANK APPLICATION*************");
			System.out.println("1.Create Account : ");
			System.out.println("2.Show Balance : ");
			System.out.println("3.Deposit : ");
			System.out.println("4.Withdraw : ");
			System.out.println("5.Fund Transfer : ");
			System.out.println("6.Print Transactions : ");
			System.out.println("7.Exit :");
			int option = scan.nextInt();
			switch (option) {
			case 1:
				System.out.println("Create Account : ");
				System.out.println("Enter your name");
				accHolderName = scan.next();
				System.out.println("Enter your type of account : ");
				typeOfAccount = scan.next();
				System.out.println("Enter your address : ");
				address = scan.next();
				System.out.println("Enter your contactNo: ");
				contactNo = scan.nextLong();
				accNo = contactNo - 100000;
			    account = new Account(accNo, accHolderName, typeOfAccount, accBalance, address, contactNo);
				accounts.put(accNo, account);
				System.out.println("account created sucussessfully with accNo : " + accNo);

				break;
			case 2:
				System.out.println("Show Balance : ");
				System.out.println("Enter your accNo : ");
				accNo = scan.nextLong();
				account = accounts.get(accNo);
				
				System.out.println("Our current balance is : " + account.getAccBalance());
				
				break;
			case 3:
				System.out.println("Deposit : ");
				System.out.println("Enter your accNo : ");
				accNo = scan.nextLong();
				System.out.println("Enter your amount : ");
				float depositAmount = scan.nextFloat();
				account = accounts.get(accNo);
				float existingBalance = account.getAccBalance();
				float finalAmount = existingBalance  + depositAmount ;
				account.setAccBalance(finalAmount);
				accounts.put(accNo,account);
				Random random = new Random();
				int transId = random.nextInt();
				Date date = new Date();
				Transaction transaction = new Transaction(transId, accNo, 0, depositAmount, "deposit", date, finalAmount);
				transactions.put(transaction, accNo);
				System.out.println("our deposit amount is : " + finalAmount);

				break;
			case 4:
				System.out.println("Withdraw : ");
				System.out.println("Enter your accNo : ");
				accNo = scan.nextLong();
				System.out.println("Enter your amount : ");
				float withdrawAmount = scan.nextFloat();
				account = accounts.get(accNo);
				float existingBalance1 = account.getAccBalance();
				float finalBalance = existingBalance1  -  withdrawAmount ;
				account.setAccBalance(finalBalance);
				accounts.put(accNo, account);
				Random random1 = new Random();
				int transId1 = random1.nextInt();
				Date date1 = new Date();
				Transaction transaction1 = new Transaction(transId1, accNo, 0, withdrawAmount, "withdraw", date1, finalBalance);
				transactions.put(transaction1, accNo);
				System.out.println("our withdraw amount is : " + finalBalance);
				
				break;
			case 5:
				System.out.println("Fund Transfer ");
				System.out.println("Enter your from acc:");
				long accNoFrom = scan.nextLong();
				System.out.println("Enter your to acc:");
				long accNoTo = scan.nextLong();
				System.out.println("Enter your amount to transfer:");
				float transferAmount = scan.nextFloat();
				Account fromAccount = accounts.get(accNoFrom);
				Account toAccount =accounts.get(accNoTo);
				float fromAccBalance = fromAccount.getAccBalance();
				float toAccBalance = toAccount.getAccBalance();
				float fromAccountBalance = fromAccBalance - transferAmount;
				float toAccountBalance = toAccBalance +transferAmount;
				fromAccount.setAccBalance(fromAccountBalance);
				
				toAccount.setAccBalance(toAccountBalance);
				accounts.put(accNoFrom, fromAccount);
				accounts.put(accNoTo, toAccount);
				Random random2 = new Random();
				int transId2 = random2.nextInt();
				Date date2 = new Date();
				Transaction transaction2 = new Transaction(transId2, accNoFrom, accNoTo, transferAmount, "FundTransfer", date2, fromAccountBalance);
				transactions.put(transaction2, accNoFrom);
				System.out.println("Your account balance after transfer is : " + fromAccount.getAccBalance());

				break;
			case 6:
				System.out.println("Print Transactions");
				Set<Transaction> set = transactions.keySet();
				Iterator<Transaction> itr = set.iterator();
				while(itr.hasNext()) {
					
					
					//System.out.println(itr.next());
					Transaction trans=itr.next();
					//System.out.println(trans);
					
					System.out.printf("%-15s%-15s%-15s%-15s%-30s%-15s%-15s ", "transId", "accNoFrom", "accNoTo",
							"amount", "dateOfTrans", "transType", "Balance");
					System.out.println();
					
					System.out.printf("%-15s%-15s%-15s%-15s%-30s%-15s%-15s ", trans.getTransId(), trans.getAccNoFrom(),
							trans.getAccNoTo(), trans.getAmount(), trans.getDateOfTrans(), trans.getTransType(),
							trans.getBalance());
					System.out.println();
				
				
				}

				break;
			default:
				System.out.println("Thank u for using appliction :");
				value = false;
				System.exit(0);
				scan.close();
				break;
			}

		}
	}
}
