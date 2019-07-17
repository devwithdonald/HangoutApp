import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdateBusinessEventFormComponent } from './update-business-event-form.component';

describe('UpdateBusinessEventFormComponent', () => {
  let component: UpdateBusinessEventFormComponent;
  let fixture: ComponentFixture<UpdateBusinessEventFormComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UpdateBusinessEventFormComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UpdateBusinessEventFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
