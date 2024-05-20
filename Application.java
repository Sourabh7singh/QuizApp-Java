import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Application implements ActionListener
{
    JFrame main_Frame,Home_page,frame,Answers;
    Font S_font = new Font("Agency FB",Font.BOLD,40);
    Font end_font = new Font("Bernard MT Condensed",Font.BOLD,70);
    JButton yes,no,submit,results,exit;
    JPanel question,option;
    int current = 1, result = 0;
    JLabel Question;
    ButtonGroup g;
    JRadioButton op1,op2,op3,op4;
    String Data[]=new String[10],answers[]=new String[10],user_data[]=new String[10];
    int i=0;
    void Main_page()
    {
        JLabel quiz = new JLabel("Java Quiz");
        Home_page.dispose();
        main_Frame = new JFrame("Online Examination System");
        question = new JPanel();
        option = new JPanel();
        Question = new JLabel("");
        op1 = new JRadioButton("");
        op2 = new JRadioButton("");
        op3 = new JRadioButton("");
        op4 = new JRadioButton("");
        g = new ButtonGroup();
        submit = new JButton("Submit");
        
        g.add(op1);
        g.add(op2);
        g.add(op3);
        g.add(op4);

        main_Frame.setVisible(true);
        main_Frame.setSize(1920,1080);
        main_Frame.setLayout(null);
        main_Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        op1.setBackground(Color.lightGray);
        op2.setBackground(Color.lightGray);
        op3.setBackground(Color.lightGray);
        op4.setBackground(Color.lightGray);
        
        main_Frame.add(quiz);
        quiz.setBounds(550,0,600,100);
        quiz.setFont(new Font("Algerian",Font.BOLD,70));
        quiz.setForeground(Color.GREEN);
        main_Frame.add(question);
            question.add(Question);
            question.setLayout(null);
        Question.setBounds(50,0,1400,300);
        Question.setFont(S_font);
        
        main_Frame.add(option);
        option.setLayout(null);
        
        option.add(submit);
        submit.setBounds(550,350,300,60);
        submit.setFont(S_font);

        option.add(op1);
        op1.setBounds(100,20,1400,50);
        op1.setFont(S_font);

        option.add(op2);
        op2.setBounds(100,90,1400,50);
        op2.setFont(S_font);

        option.add(op3);
        op3.setBounds(100,160,1400,50);
        op3.setFont(S_font);

        option.add(op4);
        op4.setBounds(100,230,1400,50);
        op4.setFont(S_font);

        question.setBounds(10,100,1520,200);
        option.setBounds(10,350,1520,500);
        Question.setBounds(20,0,1520,100);

        question.setBackground(Color.lightGray);
        option.setBackground(Color.lightGray);
        submit.addActionListener(this);
    }

    void setData()
    {
        switch(current)
        {
            case 1:
            Question.setText("Q1. The number of primitive data types in java are?");
            op1.setText("6");
            op2.setText("7");
            op3.setText("8");//
            op4.setText("9");
            break;

            case 2:
            Question.setText("Q2. What is the size of float and double in java?");
            op1.setText("32 and 64");//
            op2.setText("32 and 32");
            op3.setText("64 and 64");
            op4.setText("64 and 32");
            break;

            case 3:
            Question.setText("Q3. When an array is passed to the method, what does the method receive? ");
            op1.setText("The refrence of the array");//
            op2.setText("A copy of the array");
            op3.setText("Length of the array");
            op4.setText("Copy of list element");
            break;

            case 4:
            Question.setText("Q4. Select the valid statement to declare and initialize an array");
            op1.setText("int[]A={}");
            op2.setText("int[]A = {1,2,3}");//
            op3.setText("int[]A = (1,2,3)");
            op4.setText("int[][]A = {1,2,3}");
            break;
            
            case 5:
            Question.setText("Q5. Arrays in Java are");
            op1.setText("Object refrences");
            op2.setText("Objects");//
            op3.setText("Primitive data types");
            op4.setText("none");
            break;
            
            case 6:
            Question.setText("Q6. When is the object created with new keyword?");
            op1.setText("At run time");//
            op2.setText("At compile time");
            op3.setText("Depends on the code");
            op4.setText("none");
            break;
            
            case 7:
            Question.setText("Q7. Identify the corrected definition of package");
            op1.setText("A package is a collection of editing tools");
            op2.setText("A package is a collection of classes");
            op3.setText("A package is a collection of classes and interfaces");//
            op4.setText("A package is a collection of interfaces");
            break;
            
            case 8:
            Question.setText("Q8. In which of the following is toString() method defined?");
            op1.setText("java.lang.object");//
            op2.setText("java.lang.string");
            op3.setText("java.lang.util");
            op4.setText("none");
            break;
            
            case 9:
            Question.setText("Q9. compare to() returs");
            op1.setText("True");
            op2.setText("false");
            op3.setText("An int value");//
            op4.setText("none");
            break;
            
            case 10:
            Question.setText("Q10. Identify the return type of a method that does not return any value?");
            op1.setText("int");
            op2.setText("void");//ans//
            op3.setText("double");
            op4.setText("none");
            break;
        }
        
        
    }

    boolean anscheck()
    {
        switch(current)
        {
            case 1:return (op3.isSelected());
            case 2:return (op1.isSelected());
            case 3:return (op1.isSelected());
            case 4:return (op2.isSelected());
            case 5:return (op2.isSelected());
            case 6:return (op1.isSelected());
            case 7:return (op3.isSelected());
            case 8:return (op1.isSelected());
            case 9:return (op3.isSelected());
            case 10:return (op2.isSelected());
            default: return false;
        
        }
    }

    void resultpage(int result)
    {
        frame = new JFrame("Online Examination System");
        ImageIcon icon = new ImageIcon("apple1.png");
        JLabel Icon = new JLabel(icon);
        results = new JButton("View Answers");
        exit = new JButton("Exit");

        frame.setVisible(true);
        frame.setSize(1920,1400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Congratulations!! your score was "+result);
        frame.add(label);
        frame.add(Icon);
        frame.add(results);
        frame.add(exit);

        label.setBounds(300,350,1080,400);
        Icon.setBounds(600,10,400,479);
        results.setBounds(350,650,400,100);
        exit.setBounds(800,650,400,100);
        label.setFont(end_font);
        results.setFont(S_font);
        exit.setFont(S_font);
        label.setForeground(Color.GREEN);
        results.addActionListener(this);
        exit.addActionListener(this);

    }
    void Answer_page()
    {
        frame.dispose();
        Answers = new JFrame("Online Examination System");
        Answers.setVisible(true);
        Answers.setSize(1920,1400);
        Answers.setLayout(null);
        Answers.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextArea ans1 = new JTextArea("");
        Answers.add(ans1);
        JScrollPane scroll = new JScrollPane(ans1,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        Answers.add(scroll);
        scroll.setBounds(0,0,1900,800);

        int j=0;
        while(j<10)
        {
            ans1.setText(ans1.getText()+Data[j]+"\n");
            ans1.setText(ans1.getText()+"The Answer is: "+answers[j]+"\n");
            ans1.setText(ans1.getText()+"Your answer is: "+user_data[j]+"\n");
            j++;
        }

        ans1.setBackground(Color.ORANGE);
        ans1.setFont(S_font);
        ans1.setEditable(false);
        
    }
    Application()
    {
        Home_page = new JFrame("Online Examination System");
        ImageIcon icon = new ImageIcon("apple.png");
        JLabel Icon = new JLabel(icon);
        JLabel text1 = new JLabel("Java Quiz");
        JLabel text = new JLabel("Do you want to play this game??");
        yes = new JButton("Yes!");
        no = new JButton("No");

        Home_page.setVisible(true);
        Home_page.setSize(1920,1400);
        Home_page.setLayout(null);
        
        Home_page.add(Icon);
        Home_page.add(text);
        Home_page.add(yes);
        Home_page.add(no);
        Home_page.add(text1);

        text.setFont(S_font);
        yes.setFont(S_font);
        no.setFont(S_font);
        text1.setFont(new Font("Algeiran",Font.BOLD,50));

        
        Icon.setBounds(600,0,400,479);
        text1.setBounds(700,450,500,200);
        text.setBounds(550,500,1400,200);
        yes.setBounds(400,650,400,100);
        no.setBounds(850,650,400,100);

        text.setForeground(Color.MAGENTA);
        yes.addActionListener(this);
        no.addActionListener(this);

        Home_page.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    String Userinputs()
    {
        if(op1.isSelected())
        return (op1.getText());
        if(op2.isSelected())
        return (op2.getText());
        if(op3.isSelected())
        return (op3.getText());
        if(op4.isSelected())
        return (op4.getText());
        else
        return("Not answered");
        
    }
    void create_solutions()
    {
        switch(current)
        {
            case 1:Data[i]=Question.getText();answers[i]=op3.getText();user_data[i]=Userinputs();i++;break;
            case 2:Data[i]=Question.getText();answers[i]=op1.getText();user_data[i]=Userinputs();i++;break;
            case 3:Data[i]=Question.getText();answers[i]=op1.getText();user_data[i]=Userinputs();i++;break;
            case 4:Data[i]=Question.getText();answers[i]=op2.getText();user_data[i]=Userinputs();i++;break;
            case 5:Data[i]=Question.getText();answers[i]=op2.getText();user_data[i]=Userinputs();i++;break;
            case 6:Data[i]=Question.getText();answers[i]=op1.getText();user_data[i]=Userinputs();i++;break;
            case 7:Data[i]=Question.getText();answers[i]=op3.getText();user_data[i]=Userinputs();i++;break;
            case 8:Data[i]=Question.getText();answers[i]=op1.getText();user_data[i]=Userinputs();i++;break;
            case 9:Data[i]=Question.getText();answers[i]=op3.getText();user_data[i]=Userinputs();i++;break;
            case 10:Data[i]=Question.getText();answers[i]=op2.getText();user_data[i]=Userinputs();i++;break;

        }
        
    }        

    public static void main(String[] args) 
    {
        new Application();
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==yes)
        {
            Main_page();
            setData();
        }
        if((e.getSource()==no)||(e.getSource()==exit))
        System.exit(0);

        if(e.getSource()==results)
        Answer_page();
        
        if(e.getSource()==submit)
        {
            if(anscheck())
            {
                result=result+1;
            }    
            create_solutions();
            current++;
            setData();
            if(current==11)
            {
                main_Frame.dispose();
                resultpage(result);
            }
        }

    }
    
}
