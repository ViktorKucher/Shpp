package com.shpp.rshmelev.cs;

public class Assignment1Part4 extends SuperKarel {
    @Override
    public void run() throws Exception {
        while (true) {
            fillRow(); // Заповнюємо поточний рядок
            if (!moveToNextRow()) { // Переходимо на наступний рядок або виходимо
                break;
            }
        }
    }

    // Метод заповнення рядка
    private void fillRow() throws Exception {
        while (true) {
            putBeeper(); // Кладемо біпер, якщо його немає
            if (frontIsClear()) {
                move(); // Рухаємось вперед
                if (frontIsClear()) {
                    move(); // Пропускаємо одну клітинку
                } else {
                    break; // Якщо далі немає шляху, виходимо
                }
            } else {
                break; // Кінець рядка
            }
        }
    }

    // Перехід на наступний рядок
    private boolean moveToNextRow() throws Exception {
        if (facingEast()) {
            if (leftIsClear()) {
                turnLeft();
                move();
                turnLeft();
                return true;
            }
        } else if (facingWest()) {
            if (rightIsClear()) {
                turnRight();
                move();
                turnRight();
                return true;
            }
        }
        return false; // Якщо немає шляху, завершення роботи
    }
}
