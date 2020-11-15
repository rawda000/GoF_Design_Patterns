package Iterator.implementation3;

import java.util.Iterator;
import java.util.LinkedList;

public class EmployeesIterator implements Iterator<Employee> {
    private LinkedList<Employee> employees;
    private int pos;

    public EmployeesIterator(LinkedList<Employee> employees) {
        this.employees = employees;
        this.pos = 0;
    }

    public void first() {
        pos = 0;
    }

    @Override
    public boolean hasNext() {
        if (pos >= employees.size())
            return false;
        return true;
    }

    @Override
    public Employee next() {
        //if (pos >= employees.size()) return null;
        return employees.get(pos++);
    }

    public Employee currentItem() {
        return employees.get(pos);
    }
}
