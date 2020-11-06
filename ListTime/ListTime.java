package ListTime;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class ListTime {
    long N;
    List<Object> array = new ArrayList<>();
    List<Object> linked = new LinkedList<>();
    public ListTime(long N){
        this.N = N;
    }

    public void TestTime()
    {
        Time time1 = new Time();
        Time time2 = new Time();

        System.out.println("Кол-во элементов: " + N);

        time1.start();
        FillingList(array);
        time1.stop();

        time2.start();
        FillingList(linked);
        time2.stop();

        System.out.println("Заполнение Array : " + time1.getElapsed() + " Linked: " + time2.getElapsed());



        time1.restart();
        GetList(array);
        time1.stop();

        time2.restart();
        GetList(linked);
        time2.stop();

        System.out.println("Получение Array : " + time1.getElapsed() + " Linked: " + time2.getElapsed());

        time1.restart();
        SetList(array);
        time1.stop();

        time2.restart();
        SetList(linked);
        time2.stop();

        System.out.println("Присвоение Array : " + time1.getElapsed() + " Linked: " + time2.getElapsed());

        time1.restart();
        RemoveList(array);
        time1.stop();

        time2.restart();
        RemoveList(linked);
        time2.stop();

        System.out.println("Удаление Array : " + time1.getElapsed() + " Linked: " + time2.getElapsed());

    }

    private void FillingList(List mas){
        for(int i = 0; i < N; i++)
            mas.add(Math.random());
    }

    private void GetList(List mas)
    {
        for(int i = 0; i < N; i++)
            mas.get(i);
    }

    private void SetList(List mas)
    {
        for(int i = 0; i < N; i++)
            mas.set(i,i);

    }

    private void RemoveList(List mas){
        for(int i = 0; i < N; i++)
            mas.remove(0);
    }
}
