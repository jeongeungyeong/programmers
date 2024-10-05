-- 코드를 작성해주세요
SELECT child.ID, child.GENOTYPE, (parent.GENOTYPE) AS PARENT_GENOTYPE
FROM ECOLI_DATA child, ECOLI_DATA parent
WHERE child.PARENT_ID = parent.ID 
AND (child.GENOTYPE & parent.GENOTYPE) = parent.GENOTYPE
ORDER BY ID ASC;
