delete from Item_Ref;
delete from Order;
delete from Service_Order;
delete from Item;

insert into Item(id, name, type)
                values ('STR', 'Structure', 'FOUNDATION');
insert into Item(id, name, type)
                values ('HAIC', 'Heating and Air Conditioning', 'WALL');
insert into Item(id, name, type)
                values ('PS', 'Plumbing Systems', 'ELECTRICAL');
insert into Item(id, name, type)
                values ('DRIAN', 'Drone Roof Inspections As Needed', 'ROOF');
insert into Item(id, name, type)
                values ('AV', 'Attic and Ventilation', 'CEILING');
insert into Item(id, name, type)
                values ('GCDS', 'Garage, Carport, Driveways and Sidewalks', 'YARD_AND_GARDEN');
insert into Item(id, name, type)
                values ('SIIFW', 'Structural Inspection of Interior Floors, Walls, Doors, Ceilings and Water', 'FOUNDATION');
insert into Item(id, name, type)
                values ('F', 'Fireplaces', 'ROOF');
insert into Item(id, name, type)
                values ('ES', 'Electrical Systems', 'ELECTRICAL');
