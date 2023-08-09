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

## step 4 : Coding
- [ ] creating models 
- [ ] requirement by requirement
