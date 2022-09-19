package structuralpatterns.composite.example2;

/**
 * Eine Menge von Objekten haben dasselbe Interface und müssen für viele Verantwortlichkeiten als Gesamtheit
 * betrachtet werden. → Composite implementiert dasselbe Interface und leitet Methoden an die darin
 * enthaltenen Objekten weiter.
 */
public class CompositePatternDemo {
    public static void main(String[] args) {
        Department salesDepartment = new SalesDepartment(1, "Sales department");
        Department financialDepartment = new FinancialDepartment(2, "Financial department");

        HeadDepartment headDepartment = new HeadDepartment(3, "Head department");

        headDepartment.addDepartment(salesDepartment);
        headDepartment.addDepartment(financialDepartment);

        headDepartment.printDepartmentName();
    }
}
