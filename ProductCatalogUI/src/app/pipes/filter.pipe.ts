import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'filter'
})
export class FilterPipe implements PipeTransform {

  transform(value: any, args: any[]): any {
    const sortDir=args[0];
    value.sort((a:any,b:any)=>{
      if(a[sortDir]<b[sortDir]){
        return 1;
      }
      else if(a[sortDir]>b[sortDir]){
        return -1;
      }
      else{
        return 0;
      }

    })
    return value;
  }

}
