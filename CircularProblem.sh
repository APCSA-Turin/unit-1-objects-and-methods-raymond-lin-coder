#!/bin/bash


n=2025

ans=0
i=0
series=0

while [ $series -lt $n ]; do
    power=$((2 ** i))
    if [ $n -le $((series + power)) ]; then
                break
        fi
    series=$((series + power))
    i=$((i + 1))
done

pos=$((n - series))

if [ $pos -eq 0 ]; then
                ans=1
else
ans=$((1 + (pos - 1) * 2))
fi
echo $ans
