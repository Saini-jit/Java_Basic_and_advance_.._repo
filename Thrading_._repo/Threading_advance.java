/*Aapne ab tak bahut hi behtareen aur concept-clearing sawal puche hain! Aapki learning journey bilkul step-by-step aur logical rahi hai.

Ab tak ke aapke sabhi sawalon ki ek saaf aur krambaddh (structured) summary yeh rahi:

---

### 1. Java Threading & `join()` Method ke Basics

* **`join()` ka use:** Yeh samajhna ki `join()` se ek thread dusri thread ke khatam hone ka wait karti hai.
* **Kon rukta hai?:** Yeh clear karna ki sirf wahi thread rukti hai jo `join()` ko call karti hai (jaise Grandpa-Dad-Child example), baaki threads par iska koi asar nahi padta.
* **Parent & Child Thread Independence:** Yeh doubt clear karna ki parent thread ke khatam hone se child thread par koi asar nahi padta; child thread ek independent unit ki tarah apna kaam poora karti hai.

### 2. Advanced `join()` Scenarios aur Edge Cases

* **Timing & Edge Cases:** `start()` aur `join()` ke beech ke chote se time gap (window of vulnerability) mein kya hota hai—jaise agar thread pehle hi khatam ho chuki ho ya bina `start()` ke `join()` call kar diya jaye.
* **Multiple Threads & Siblings:** Agar ek main thread ke kayi child threads hain, toh kya sab apne aap rukte hain? Iska jawab yeh tha ki har ek ke liye alag se `join()` call karna padta hai.

### 3. Inheritance, `Runnable`, aur Interfaces

* **`implements Runnable`:** Jab class pehle se kisi aur class ko extend kar rahi ho, tab thread banane ke liye `Runnable` ka use kaise karte hain aur parent class ke interfaces ko dobara implement karne ki zaroorat nahi padti.
* **Multiple Inheritance vs Interfaces:** Java mein multiple *classes* ko ek sath `extends` karna kyon allowed nahi hai (Diamond Problem ki wajah se), lekin multiple *interfaces* ko `implements` karna kyon allowed hai.

### 4. Composition aur Code Structure

* **Composition (Has-A Relationship):** Agar do aisi classes hain jo kisi interface mein nahi hain aur unhe extend bhi nahi kiya ja sakta, toh unke objects apni class ke andar banakar unka use kaise kiya jata hai.
* **Declaration vs Execution:** Objects ko class level par (method ke bahar) kahan declare kar sakte hain aur unke methods ko call karne ke liye method ke andar code likhna kyon zaroori hai.

---

Aapke yeh sare sawal yeh dikhate hain ki aap sirf code ratte nahi hain, balki uske **internal working logic** ko gehraai se samajhna chahte hain. Is tarah ke sawal poochhna ek acche programmer ki pehchan hai!

Iske aage agar aapko threading, synchronization, ya kisi aur topic mein koi aur confusion ho, toh bejhijhak poochhiye!*/
