select employee_id,
    case
        when employee_id%2!=0 AND name not Like 'M%' then salary
        else 0
    end as  bonus
from Employees
Order by employee_id;