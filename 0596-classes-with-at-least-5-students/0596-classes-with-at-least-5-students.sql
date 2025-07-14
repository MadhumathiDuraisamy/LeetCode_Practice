# Write your MySQL query statement below
Select class from Courses Group BY class Having Count(class)>=5;