public class BasicCommands {
    DROP TABLE users;

    CREATE TABLE users(
            ID INT AUTO_INCREMENT,
            First_Name VARCHAR(15),
    Last_Name VARCHAR(15),
    Stack VARCHAR(10) NOT NULL,
    Age INT NOT NULL,
    PRIMARY KEY(ID)
);

    ALTER TABLE users ADD score DECIMAL(4,2);
    ALTER TABLE users DROP score;



    INSERT INTO users(First_Name,Last_Name,Stack,Age,Score)  VALUES(1,'Jideofor','Emmanuel', 'JAVA',24,85.96);
    INSERT INTO users VALUES (2,'Abimbola','Kehinde', 'NODE',27,64.96);
    INSERT INTO users(First_Name,Last_Name,Stack,Age,Score)  VALUES ('Blessing','Chenemi', 'PYTHON',19,70.88);
    INSERT INTO users(First_Name,Last_Name,Stack,Age,Score)  VALUES ('Onyia','Emmanuella', '.NET',17,92.01);

    INSERT INTO users(First_Name,Last_Name,Stack,Age) VALUES('Chidimma','Rita','C#',64.12);
    INSERT INTO users(First_Name,Last_Name,Stack,Score,age) VALUES('Loveth','Dikachi','PhotoShop',21,67);

    SELECT * FROM users;
    DESCRIBE users;


    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}