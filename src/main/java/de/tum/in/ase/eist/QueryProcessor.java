package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "JuliusR";
        } else if (query.contains("what is")&& query.contains("plus")){ // TODO extend the programm here
            String[] splitted = query.split(" ");
            int i = Integer.parseInt(splitted[2]);
            int j = Integer.parseInt(splitted[4]);
            int x = i+j;
            return ""+ x;
        }
        else{
            return"";
        }
    }
}
