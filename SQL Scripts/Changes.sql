ALTER TABLE employee ADD password VARCHAR(16) DEFAULT '12345678';
ALTER TABLE employee ALTER IsManager SET DEFAULT false;
ALTER TABLE purchase ALTER TotalCost SET DEFAULT 0.00;
ALTER TABLE purchase ALTER pDate SET DEFAULT (current_date);