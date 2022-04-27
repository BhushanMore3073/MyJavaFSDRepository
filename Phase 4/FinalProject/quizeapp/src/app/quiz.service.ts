import { Injectable } from '@angular/core';
import { Quiz } from './quiz.model';

@Injectable({
  providedIn: 'root'
})
export class QuizService {

  quizzes:Quiz[] = [
    {
      question:'What\'s the capital of india ?',
      answer: [
        { option : 'Mumbai', correct:false },
        { option : 'Kolkata', correct:false },
        { option : 'Chennai', correct:false },
        { option : 'Delhi', correct:true }
      ]
    },
    {
      question:'Who is prime minister of india ?',
      answer: [
        { option : 'Amit shah', correct:false },
        { option : 'Rahul Gandhi', correct:false },
        { option : 'Narendra Modi', correct:true },
        { option : 'Yogi Adityanath', correct:false }
      ]
    },
    {
      question:'What is javascript',
      answer: [
        { option : 'javascript is client side programing language', correct:false },
        { option : 'javascript is server side programing language', correct:false },
        { option : 'both A and B', correct:true },
        { option : 'none of the above', correct:false }
      ]
    },
    {
      question:'Which of the following is true about angular ?',
      answer: [
        { option : 'Angular is framework based on TypeScript', correct:true },
        { option : 'angular is programing language', correct:false },
        { option : 'angular is server side scripting language', correct:false },
        { option : 'Angular provide single component for each webpage', correct:false }
      ]
    },
    {
      question:'Interpolation in angular done using ?',
      answer: [
        { option : '{{}}', correct:true },
        { option : '{{{}}}', correct:false },
        { option : '{{!var}}', correct:false },
        { option : '!!!', correct:false }
      ]
    },
  ]
  constructor() { }

  getQuizzes(){
    return this.quizzes;
  }
}
