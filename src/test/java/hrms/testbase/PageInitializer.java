package hrms.testbase;

import hrms.pages.*;

public class PageInitializer extends BaseClass {
    public static LoginPage loginPage;
    public static DashboardPage dashboardPage;
    public static ContactDetailsPage contactDetailsPage;
    public static EmployeeListPage employeeListPage;
    public static PersonalDetailsPage personalDetailsPage;
    public static EmergencyContactsPage emergencyContactsPage;
    public static DependentsPage dependentsPage;
    public static QualificationsPage qualificationsPage;
    public static MembershipsPage membershipsPage;
    public static AdminPage adminPage;
    public static AdminSkillsPage adminSkillsPage;
    public static AdminMembershipsPage adminMembershipsPage;

    public static void initializePageObjects() {
        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();
        contactDetailsPage = new ContactDetailsPage();
        employeeListPage = new EmployeeListPage();
        personalDetailsPage = new PersonalDetailsPage();
        emergencyContactsPage = new EmergencyContactsPage();
        dependentsPage = new DependentsPage();
        qualificationsPage = new QualificationsPage();
        membershipsPage = new MembershipsPage();
        adminPage = new AdminPage();
        adminSkillsPage = new AdminSkillsPage();
        adminMembershipsPage = new AdminMembershipsPage();
    }
}
