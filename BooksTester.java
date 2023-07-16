class BooksTester{
public static void main(String args[]){
Books book=new Books();
book.name="To Kill a Mockingbird";
book.author=" Harper Lee";
book.price=350.00;
book.noOfPages=100;
book.publicationName=" J.B. Lippincott & Co";
book.toGainKnowledge();
System.out.println("Create 1St Copy of the Book");
System.out.println(book.name + " "+ book.author + " "+ book.price + " "+ book.noOfPages + " "+ book.publicationName);

Books book1=new Books();
book1.name="Pride and Prejudice";
book1.author=" Jane Austen";
book1.price=800.00;
book1.noOfPages=500;
book1.publicationName="T. Egerton, Whitehall";
book1.toGainKnowledge();
System.out.println("Create 2nd Copy of the Book");
System.out.println(book1.name + " "+ book1.author + " "+ book1.price + " "+ book1.noOfPages + " "+ book1.publicationName);


Books book2=new Books();
book2.name="The Hobbit";
book2.author="J.R.R. Tolkien";
book2.price=1200.00;
book2.noOfPages=1000;
book2.publicationName="George Allen & Unwin";
book2.toGainKnowledge();
System.out.println("Create 3rd Copy of the Book");
System.out.println(book2.name + " "+ book2.author + " "+ book2.price + " "+ book2.noOfPages + " "+ book2.publicationName);


Books book3=new Books();
book3.name="Harry Potter and the Philosopher's Stone";
book3.author="J.K. Rowling";
book3.price=1200.00;
book3.noOfPages=1500;
book3.publicationName="Bloomsbury Publishing)";
book3.toGainKnowledge();
System.out.println("Create 4th Copy of the Book");
System.out.println(book3.name + " "+ book3.author + " "+ book3.price + " "+ book3.noOfPages + " "+ book3.publicationName);


Books book4=new Books();
book4.name="The Great Gatsby";
book4.author=" F. Scott Fitzgerald";
book4.price=650;
book4.noOfPages=1000;
book4.publicationName="Charles Scribner's Sons";
book4.toGainKnowledge();
System.out.println("Create 5th Copy of the Book");
System.out.println(book4.name + " "+ book4.author + " "+ book4.price + " "+ book4.noOfPages + " "+ book4.publicationName);


Books book5=new Books();
book5.name="The Catcher in the Rye";
book5.author="Salinger ";
book5.price=800.00;
book5.noOfPages=900;
book5.publicationName=" Little, Brown and Company";
book5.toGainKnowledge();
System.out.println("Create 6th Copy of the Book");
System.out.println(book5.name + " "+ book5.author + " "+ book5.price + " "+ book5.noOfPages + " "+ book5.publicationName);


Books book6=new Books();
book6.name="The Lord of the Rings";
book6.author="J.R.R. Tolkien";
book6.price=900.00;
book6.noOfPages=900;
book6.publicationName="George Allen";
book6.toGainKnowledge();
System.out.println("Create 7th Copy of the Book");
System.out.println(book6.name + " "+ book6.author + " "+ book6.price + " "+ book6.noOfPages + " "+ book6.publicationName);


Books book7=new Books();
book7.name="1984";
book7.author="George Orwell ";
book7.price=1500.00;
book7.noOfPages=2000;
book7.publicationName="Secker & Warburg";
book7.toGainKnowledge();
System.out.println("Create 8th Copy of the Book");
System.out.println(book7.name + " "+ book7.author + " "+ book7.price + " "+ book7.noOfPages + " "+ book7.publicationName);


Books book8=new Books();
book8.name="To the Lighthouse";
book8.author="Virginia Woolf";
book8.price=800.00;
book8.noOfPages=500;
book8.publicationName="Hogarth Press";
book8.toGainKnowledge();
System.out.println("Create 9th Copy of the Book");
System.out.println(book8.name + " "+ book8.author + " "+ book8.price + " "+ book8.noOfPages + " "+ book8.publicationName);


Books book9=new Books();
book9.name="Moby-Dick";
book9.author="Herman Melville";
book9.price=1200.00;
book9.noOfPages=3000;
book9.publicationName="Richard Bentley";
book9.toGainKnowledge();
System.out.println("Create 10th Copy of the Book");
System.out.println(book9.name + " "+ book9.author + " "+ book9.price + " "+ book9.noOfPages + " "+ book9.publicationName);



}


}