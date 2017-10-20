/* Return an object with two error classes. One is called Err, and it encapsulates an error message
along with a severity code. The second is called ErrorInfo. It defines a method called getErrorInfo(),
which returns an Err object.

Each time getErrorInfo() is invoked, a new Err object is create, and a reference to it is returned to the calling routine.
The object is then used within main() to display the error message and severity code.

When an object is returned by a method, it remains in existence until there are no more references to it. At that point,
it is subject to garbage collection. Thus, an object won't be just destroyed just because the method that created it terminates.
 */

class Err {     // Return a programmer-defined object.
    String msg;
    int severity;

    Err(String m, int s) {
        msg = m;
        severity = s;
    }
}

class ErrorInfo {
    String msgs[] = {
            "Output Error",
            "Input Error",
            "Disk Full",
            "Index Out-of-Bounds"
    };
    int howbad[] = { 3, 3, 2, 4};

    Err getErrorInfo(int i) {   // Return an object of type Err
        if(i >= 0 & i < msgs.length)
            return new Err(msgs[i], howbad[i]);
        else
            return new Err("Invalid Error Code.", 0);
    }
}

class ErrInfo {
    public static void main(String args[]) {
        ErrorInfo err = new ErrorInfo();
        Err e;  // instantiate variable
        e = err.getErrorInfo(2);
        System.out.println(e.msg + " severity: " + e.severity);
        e = err.getErrorInfo(19);
        System.out.println(e.msg + " severity: " + e.severity);
    }
}

/*
Output
Disk Full severity: 2
Invalid Error Code. severity: 0
 */