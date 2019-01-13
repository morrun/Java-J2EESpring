import { Directive, HostBinding, HostListener } from '@angular/core';
@Directive({
	selector:'[colorChange]'
})
export class ColorChangeDirective{
	possibleColors = [
    	'darksalmon', 'hotpink', 'lightskyblue', 'goldenrod', 'peachpuff',
    	'mediumspringgreen', 'cornflowerblue', 'blanchedalmond', 'lightslategrey'
  	];
	@HostBinding('style.color') color = 'red';
	@HostBinding('style.border-color') borderColor = 'red';

	@HostListener('keydown')
	change(event: Event) {
		const colorPick = Math.floor(Math.random() * this.possibleColors.length);

    	this.color = this.borderColor = this.possibleColors[colorPick];
	}
	constructor() {}
}