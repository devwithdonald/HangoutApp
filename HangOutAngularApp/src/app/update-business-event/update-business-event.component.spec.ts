import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdateBusinessEventComponent } from './update-business-event.component';

describe('UpdateBusinessEventComponent', () => {
  let component: UpdateBusinessEventComponent;
  let fixture: ComponentFixture<UpdateBusinessEventComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UpdateBusinessEventComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UpdateBusinessEventComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
