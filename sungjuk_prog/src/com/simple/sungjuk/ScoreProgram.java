package com.simple.sungjuk;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

class Student {
    private String name;
    private int kor, eng, math;

    public Student(String name, int kor, int eng, int math) {
        setName(name);
        setKor(kor);
        setEng(eng);
        setMath(math);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty())
            throw new IllegalArgumentException("이름을 입력하세요.");
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        if (kor < 0 || kor > 100)
            throw new IllegalArgumentException("점수 범위가 맞지 않습니다.");
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        if (eng < 0 || eng > 100)
            throw new IllegalArgumentException("점수 범위가 맞지 않습니다.");
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        if (math < 0 || math > 100)
            throw new IllegalArgumentException("점수 범위가 맞지 않습니다.");
        this.math = math;
    }

    public int getTotal() {
        return kor + eng + math;
    }

    public double getAverage() {
        return getTotal() / 3.0;
    }

    public String getGrade() {
        double avg = getAverage();
        if (avg >= 90) return "A";
        else if (avg >= 80) return "B";
        else if (avg >= 70) return "C";
        else if (avg >= 60) return "D";
        else return "F";
    }

    public Object[] toRow() {
        return new Object[]{
                name, kor, eng, math,
                getTotal(),
                String.format("%.2f", getAverage()),
                getGrade()
        };
    }
}

public class ScoreProgram extends JFrame {
    private JTextField nameField, korField, engField, mathField;
    private JTable table;
    private DefaultTableModel model;

    private ArrayList<Student> students = new ArrayList<>();

    public ScoreProgram() throws HeadlessException {
        setTitle("성적처리프로그램");
        setSize(700,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        //입력 패널
        JPanel inputPanel = new JPanel(new GridLayout(4,2));
        inputPanel.add(new JLabel("이름 : "));
        nameField = new JTextField(5);
        inputPanel.add(nameField);

        inputPanel.add(new JLabel("국어 : "));
        korField = new JTextField(5);
        inputPanel.add(korField);

        inputPanel.add(new JLabel("영어 : "));
        engField = new JTextField(5);
        inputPanel.add(engField);

        inputPanel.add(new JLabel("수학 : "));
        mathField = new JTextField(5);
        inputPanel.add(mathField);


        //패널을 윈도우에 등록
        add(inputPanel,BorderLayout.NORTH);

        // 테이블
        String[] columns = {"이름", "국어", "영어", "수학", "총점", "평균", "등급"};
        model = new DefaultTableModel(columns, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                // 이름, 국어, 영어, 수학만 수정 가능
                return column >= 0 && column <= 3;
            }
        };
        table = new JTable(model);
        add(new JScrollPane(table), BorderLayout.CENTER);

        // 버튼 패널
        JPanel buttonPanel = new JPanel();
        JButton addBtn = new JButton("추가");
        JButton calcBtn = new JButton("성적계산");  // 통합 버튼

        buttonPanel.add(addBtn);
        buttonPanel.add(calcBtn);

        add(buttonPanel, BorderLayout.SOUTH);

        // 이벤트 처리
        addBtn.addActionListener(e -> addStudent());
        calcBtn.addActionListener(e -> recalcAll());

        setVisible(true);
    }

    // 학생 추가
    private void addStudent() {
        try {
            String name = nameField.getText().trim();
            int kor = Integer.parseInt(korField.getText().trim());
            int eng = Integer.parseInt(engField.getText().trim());
            int math = Integer.parseInt(mathField.getText().trim());

            Student s = new Student(name, kor, eng, math);
            students.add(s);
            model.addRow(s.toRow());

            nameField.setText("");
            korField.setText("");
            engField.setText("");
            mathField.setText("");

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "점수는 숫자로 입력해야 합니다.");
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    // 성적 계산 버튼 → 전체 행 다시 계산
    private void recalcAll() {
        int rowCount = model.getRowCount();

        for (int row = 0; row < rowCount; row++) {
            try {
                String name = model.getValueAt(row, 0).toString().trim();
                int kor = Integer.parseInt(model.getValueAt(row, 1).toString().trim());
                int eng = Integer.parseInt(model.getValueAt(row, 2).toString().trim());
                int math = Integer.parseInt(model.getValueAt(row, 3).toString().trim());

                Student s;

                if (row < students.size()) {
                    s = students.get(row);
                    s.setName(name);
                    s.setKor(kor);
                    s.setEng(eng);
                    s.setMath(math);
                } else {
                    s = new Student(name, kor, eng, math);
                    students.add(s);
                }

                model.setValueAt(s.getTotal(), row, 4);
                model.setValueAt(String.format("%.2f", s.getAverage()), row, 5);
                model.setValueAt(s.getGrade(), row, 6);

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this,
                        (row + 1) + "번째 행: 점수는 숫자로 입력해야 합니다.");
            } catch (IllegalArgumentException ex) {
                JOptionPane.showMessageDialog(this,
                        (row + 1) + "번째 행: " + ex.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        new ScoreProgram();
    }
}
