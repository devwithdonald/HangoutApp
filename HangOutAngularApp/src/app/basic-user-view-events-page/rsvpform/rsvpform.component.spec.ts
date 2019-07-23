import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RSVPFormComponent } from './rsvpform.component';

describe('RSVPFormComponent', () => {
  let component: RSVPFormComponent;
  let fixture: ComponentFixture<RSVPFormComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RSVPFormComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RSVPFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
