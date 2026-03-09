#include <iostream>
using namespace std;

class TollBooth {
private:
    int totalVehicles;
    double totalRevenue;

public:
    // Constructor
    TollBooth() {
        totalVehicles = 0;
        totalRevenue = 0.0;
    }

    // Reset function
    void reset() {
        totalVehicles = 0;
        totalRevenue = 0.0;
        cout << "Toll booth data reset successfully.\n";
    }

    // Vehicle paying toll
    void vehiclePayingToll(int vehicleType, double tollAmount) {
        totalVehicles++;
        totalRevenue += tollAmount;

        switch (vehicleType) {
        case 1:
            cout << "Standard car added. Toll collected: Rs." << tollAmount << endl;
            break;
        case 2:
            cout << "Truck added. Toll collected: Rs." << tollAmount << endl;
            break;
        case 3:
            cout << "Bus added. Toll collected: Rs." << tollAmount << endl;
            break;
        default:
            cout << "Unknown vehicle type.\n";
        }
    }

    // Getters
    int getTotalVehicles() { return totalVehicles; }
    double getTotalRevenue() { return totalRevenue; }

    // Display details
    void displayDetails() {
        cout << "\n--- Toll Booth Summary ---\n";
        cout << "Total Vehicles Passed: " << totalVehicles << endl;
        cout << "Total Revenue Collected: Rs." << totalRevenue << endl;
    }
};

int main() {
    TollBooth booth;
    int choice;

    // Fixed toll amounts
    const double CAR_TOLL = 180.0;
    const double TRUCK_TOLL = 300.0;
    const double BUS_TOLL = 250.0;

    do {
        cout << "\nMenu:\n";
        cout << "1. Add a Standard Car (Rs.180)\n";
        cout << "2. Add a Truck (Rs.300)\n";
        cout << "3. Add a Bus (Rs.250)\n";
        cout << "4. Display Total Vehicles and Revenue\n";
        cout << "5. Reset Toll Booth Data\n";
        cout << "6. Exit\n";
        cout << "Enter your choice: ";
        cin >> choice;

        switch (choice) {
        case 1:
            booth.vehiclePayingToll(1, CAR_TOLL);
            break;
        case 2:
            booth.vehiclePayingToll(2, TRUCK_TOLL);
            break;
        case 3:
            booth.vehiclePayingToll(3, BUS_TOLL);
            break;
        case 4:
            booth.displayDetails();
            break;
        case 5:
            booth.reset();
            break;
        case 6:
            cout << "Exiting program...\n";
            break;
        default:
            cout << "Invalid choice. Try again.\n";
        }
    } while (choice != 6);

    return 0;
}