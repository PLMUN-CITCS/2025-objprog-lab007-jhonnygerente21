public class BooleanExpressionsDemo {
    public static void main(String[] args) {
        
        boolean isJavaFun = true;
        boolean isHomeworkTiring = false;
        
       
        char a = 'a';
        char b = 'b';
        
       
        boolean isAGreaterThanB = a > b;
        boolean areAandBEqual = a == b;
        boolean bothConditions = isJavaFun && (a < b);
        boolean eitherCondition = isJavaFun || isHomeworkTiring;
        boolean logicalNot = !isHomeworkTiring;
        boolean exclusiveOr = isJavaFun ^ isHomeworkTiring;
        
       
        System.out.println("Is Java fun? " + isJavaFun);
        System.out.println("Is homework tiring? " + isHomeworkTiring);
        System.out.println("Is 'a' greater than 'b'? " + isAGreaterThanB);
        System.out.println("Are 'a' and 'b' equal? " + areAandBEqual);
        System.out.println("Both conditions (isJavaFun && a<b): " + bothConditions);
        System.out.println("Either condition (isJavaFun || isHomeworkTiring): " + eitherCondition);
        System.out.println("Logical NOT of isHomeworkTiring: " + logicalNot);
        System.out.println("Exclusive OR (isJavaFun ^ isHomeworkTiring): " + exclusiveOr);
    }
}
