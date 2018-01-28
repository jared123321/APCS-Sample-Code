//Name:  Baiyi Patrick Liao
//Date: September 19th, 2017
//Period:  2
//Project Title: Roses Are Rded Assignment
//Project Description: Outputs some strings in multiple lines.
//Version: 0.0.1


class RosesAreRed {

    public static void main (String [] args) {
        
        String [] contents = new String[] {
            "Roses are red",
            "Violets is blue",
            "Sugar is sweet",
            "And so are you!"
        };

        for(int i = 0; i < contents.length; i++ ){
            System.out.println(contents[i]);
        }

        //System.out.println("Roses are red\nViolets are blue\nSugar is sweet\nAnd so are you!");
    }
}
