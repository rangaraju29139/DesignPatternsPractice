# Design a ParkingLot




## step 1: Align with the interviewer ()
- [X] Be clear on the problem statement 
- [ ] align with the interviewer whether he require a interactive application or mvc or api with database etc..
- [ ] requirement gathering
  - [ ] draw the sketch.
  - [ ] image userflows
  - [ ] A Parking lot may have multiple gates
  - [ ] Gates can be of two types (entry/exit)
  - [ ] parkinglot have many floors
  - [ ] A floor in Parking lot has many parking slots
  - [ ] parkinglot can support different types of vehicles
## step 2:  Imaging user flows
<<<<<<< HEAD
  - [ ]  get a ticket / token at the entry/gate (alllocation of the slot).
  - [ ]  A bill is generated at the exit gate according to duration, Vehicle type,Timing.
  - [ ] payment has to be made either online or cash.

## Clarifying Requirements(edge cases/behaviour)

- [ ] Caliculation of payments
  - [ ] Multiple algos possible
  - [ ] Duration & VehicleTypes
- [ ] Allocation of slots
  - [ ] first come first serve
  - [ ]  first come farthest serve
  - [ ] find slot by themselves
  - [ ] premium slots
- [ ] concurrency concerns
  - [ ] what if the slots are full and at the same the one user is leaving , but the slot not showing as vacant as need to handle the concurrent.
### Always keep an eye for change in requirements


## step 3 : Class diagram 
- [ ] check nouns
- [ ] visualize  (sketch and user flow)
#### Class descriptions
- ParkingLot
  - DataMembers
    - id 
    - name 
    - address
    - List<Gate>
  - Methods


- Gate
  - DataMembers
    - id
    - GateType
    - Operator
  - Methods


- GateType(Enum for Gate)
  - EXIT
  - ENTRY


- ParkingFloor
  - DataMembers
    - id
    - level
    - List<ParkingSlot>
  - Methods


- ParkingSlot
  - DataMembers
    - id
    - number 
    - status
    - vehicleType
  - Methods


- ParkingSlotStatus(Enum for parking Slot)
  - OCCUPIED
  - AVAILABLE

- Vehicle
  - DataMembers
    - id
    - RegistrationNumber
    - VehicleType
  - Methods






- VehicleType(Enum for vehicle)
  - TWO_WHEELER
  - SMALL
  - MEDIUM
  - 


- Token
  - DataMembers
    - id
    - entryTime
    - Gate
    - Operator
    - Vehicle
    - ParkingSlot
  - Methods


- Bill
  - DataMembers
    - id
    - exitTime
    - Gate
    - Operator
    - Fare
    - Token
  - Methods


- Payment
  - DataMembers
    - id
    - Bill
    - paymentMode
    - paymentStatus
  - Methods

- PaymentMode (enum for payment)
  - CASH
  - ONLINE

- PaymentStatus(enum for payment)
  - SUCCESS
  - FAILED
  - INPROGRESS

- Operator
  - id
  - username


### Strategies
- interface SlotAllocationStrategy()
  - allotSlot(Gate,VehicleType)
- interface CaliculateFareStategy()
  - caliculateFare(entryTime,exitTime,vehicleType)

## step 3: Schema Design 
1. [ ] Make a table for all classes and enumbs
2. [ ] make columns for all primitive datamembers
3. [ ] Identify Carinality & make relations
4. 

## step 4 : Coding
- [ ] creating models 
- [ ] requirement by requirement

